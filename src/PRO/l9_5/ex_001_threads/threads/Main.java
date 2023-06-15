package PRO.l9_5.ex_001_threads.threads;

public class Main {
    // ������� ����
    static EggVoice mAnotherOpinion;

    public static void main(String[] args) {
        // ��������� ������
        mAnotherOpinion = new EggVoice();
        System.out.println("��������� ���������...");
        // ������ ������
        mAnotherOpinion.start();

        for (int i = 0; i < 5; i++) {
            try {
                // ������� ���� �� 1 �������
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("�����!");
        }

        // ����� ������ ������� 5 ����
        // ���� ������� �� �� ������ ������ �����
        System.out.println(mAnotherOpinion.isAlive());

        if (mAnotherOpinion.isAlive()) {
            try {
                // �������� ���� �� ������� �������� ��������������.
                mAnotherOpinion.join();
            } catch (InterruptedException e) {
            }
            System.out.println("������ �'������� ����!");
            // ���� ������� ��� �������� ��������������
        } else {
            System.out.println("������ �'������� �����!");
        }
        System.out.println("��������� ��������!");
    }
}

class EggVoice extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // ������� ���� �� 1 �������
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("����!");
        }
        // ����� ����� ������� 5 ����
    }
}