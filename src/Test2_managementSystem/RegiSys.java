import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

class RegiSys {

    Map<String, Member> memberMap;
    private static long id = 0;

    public RegiSys() {
        memberMap = new HashMap<String, Member>();
    }

    public static void main(String[] args) {
        RegiSys ms = new RegiSys();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        boolean end = false;
        try {
            while (!end) {
                System.out.println("◆メニュー番号を選択してください");
                System.out.println("1:登録 2:照会 3:検索 4:削除 5:保存 6:読込 8:HELP 9:終了");
                str = br.readLine();
                int n = Integer.parseInt(str);
                System.out.println("メニュー番号＞ " + n);
                switch (n) {
                    case 1:
                        System.out.println("会員情報を登録します。");
                        ms.entry(br);
                        System.out.println("会員登録が完了しました。");
                        break;
                    case 2:
                        System.out.println("会員情報を照会します");
                        ms.inquiry(br);
                        break;
                    case 3:
                        System.out.println("会員情報を検索します。");
                        ms.search(br);
                        break;
                    case 4:
                        System.out.println("会員情報を削除します。");
                        ms.delete(br);
                        break;
                    case 5:
                        ms.save();
                        break;
                    case 6:
                        ms.read();
                        break;
                    case 8:
                        System.out.println("会員管理システムの使い方を表示します。");
                        break;
                    case 9:
                        System.out.println("####会員管理システムを終了します。お疲れ様でした。####");
                        end = true;
                        break;
                    default:
                        System.out.println("1～9の範囲でもう一度番号入力をして下さい。");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * 登録
     * @param br
     * @throws IOException
     */
    void entry(BufferedReader br) throws IOException {
        Member member = new Member();
        System.out.println("■名前を入力して下さい  例）佐藤花子");
        member.setName(br.readLine());

        System.out.println("■生年月日を入力して下さい 例）19960130");
        member.setBirth(br.readLine());

        System.out.println("■電話番号を入力して下さい 例）0363925367");
        member.setTel(br.readLine());

        String entryId = String.format("JAVA%04d", ++id);
        memberMap.put(entryId, member);
        allShow();
    }

    /**
     * 削除
     * @param br
     * @throws IOException
     */
    void delete(BufferedReader br) throws IOException {
        System.out.println("削除する会員のIDを入力してください。例）DGS0001>");
        while (true) {
            String targetId = br.readLine();
            if (targetId.isEmpty()) {
                System.out.println("削除する会員のIDを入力してください。例）DGS0001>");
                continue;
            }
            if (!memberMap.containsKey(targetId)) {
                System.out.println(targetId + "は存在しないIDです。");
                break;
            }
            for (String key : memberMap.keySet()) {
                if (key.equals(targetId)) {
                    memberMap.remove(key);
                    System.out.println(key + "を削除しました。");
                    break;
                }
            }
            break;
        }
    }

    /**
     * 照会
     * @param br
     * @throws IOException
     */
    void inquiry(BufferedReader br) throws IOException {
        System.out.println("表示する会員のIDを入力してください。指定なしで全件表示。例）DGS0001>");
        String input = br.readLine();
        if (input.isEmpty()) {
            // 入力なしの場合は全件表示
            allShow();
        } else {
            Member member = memberMap.get(input);
            if (member == null) {
                System.out.println(input + "は存在しないIDです");
            } else {
                System.out.println("[会員番号]" + input);
                System.out.println("[名前]" + member.getName());
                System.out.println("[背年月日]" + " : " + member.getBirth());
                System.out.println("[電話番号]" + " : " + member.getTel());
                System.out.println();
            }
        }

    }

    /**
     * 検索
     * @param br
     * @throws IOException
     */
    void search(BufferedReader br) throws IOException {
        System.out.println("表示する会員の名前を入力してください。指定なしで全件表示。例）佐藤花子＞");
        String input = br.readLine();
        if (input.isEmpty()) {
            // 入力なしの場合は全件表示
            allShow();
        } else {
            for (Map.Entry<String, Member> e : memberMap.entrySet()) {
                if (e.getValue().getName().equals(input)) {
                    System.out.println("[会員番号]" + e.getKey());
                    System.out.println("[名前]" + e.getValue().getName());
                    System.out.println("[背年月日]" + " : " + e.getValue().getBirth());
                    System.out.println("[電話番号]" + " : " + e.getValue().getTel());
                    System.out.println();
                }
            }
        }
    }

    /**
     * すべてのデータ取得
     * @param br
     * @throws IOException
     */
    void allShow() {
        for (Map.Entry<String, Member> e : memberMap.entrySet()) {
            System.out.println("[会員番号]" + e.getKey());
            System.out.println("[名前]" + " : " + e.getValue().getName());
            System.out.println("[背年月日]" + " : " + e.getValue().getBirth());
            System.out.println("[電話番号]" + " : " + e.getValue().getTel());
            System.out.println();
        }
    }

    /**
     * 保存
     */
    void save() {
        try {
            File file = new File(new File(".").getAbsoluteFile().getParent() + "\\save.txt");
            file.createNewFile();
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

            for (Map.Entry<String, Member> e : memberMap.entrySet()) {
                pw.print(e.getKey() + ",");
                pw.print(e.getValue().getName() + ",");
                pw.print(e.getValue().getBirth() + ",");
                pw.println(e.getValue().getTel());
            }

            pw.close();

            System.out.println("保存が完了しました。");

        } catch (IOException ex) {
            // 例外時処理
            ex.printStackTrace();
        }
    }

    /**
     * 読込
     */
    void read() {
        try {
            File file = new File(new File(".").getAbsoluteFile().getParent() + "\\save.txt");

            if (file.exists()) {
                if (file.isFile() && file.canRead()) {
                    BufferedReader br = new BufferedReader(new FileReader(file));

                    String str;
                    memberMap.clear();
                    while ((str = br.readLine()) != null) {
                        String[] arr = str.split(",");
                        Member member = new Member();
                        member.setName(arr[1]);
                        member.setBirth(arr[2]);
                        member.setTel(arr[3]);
                        memberMap.put(arr[0], member);
                    }

                    br.close();

                    System.out.println("読込が完了しました。");
                } else {
                    System.out.println("ファイルが読み込めません");
                }
            } else {
                System.out.println("ファイルがありません");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

class Member {
    private String name; //名前
    private String birth; //誕生日
    private String tel; //電話番号

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
}