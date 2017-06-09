import java.util.Random;

public class Character_skill {

	interface Skill{
		int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3);
	}
	
	//�o�ʪ� �ﹳ �ĤT�W
	public Skill[] character_skill_array = new Skill[]{
			//�ȷ��
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch1_skill1(chara1); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return 0;	} },
			//����
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch2_skill1(chara1); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return 0;	} },
			//���w�p�o
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch3_skill1(chara1); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return 0;	} },
			//�������S
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch4_skill1(chara1); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return 0;	} },
			//"�[�p��",
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch5_skill1(chara1); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch5_skill2(chara1, chara2);	} },
			//"���}����",
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch6_skill1( chara1, chara2, chara3); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch6_skill2( chara1);	} },
			//"�Z���Z",
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch7_skill1( chara1); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch7_skill2( chara1, chara2, chara3);	} },
			//"���ڰǵ�",
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch8_skill1( chara1, chara2); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch8_skill2( chara1, chara2);	} },
			//"�[�ԫ��w",
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch9_skill1( chara1); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch9_skill2( chara1);	} },
			//"�Ħ��",
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch10_skill1( chara1, chara2); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch10_skill2( chara1);	} },
			//"���L",
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch11_skill1( chara1, chara2); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch11_skill2( chara1, chara2);	} },
			//"�өg����"
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch12_skill1( chara1, chara2); }},
			new Skill(){public int skill_action(Character_Data chara1,Character_Data chara2,Character_Data chara3){ 
				return ch12_skill2( chara1, chara2);	} }
	};
			

	public static int no_skill = 0;
	public static int general_skill = 1;
	public static int attack_all = 2;
	public static int change_attack = 3;
	public static int add_dise = 4;
	public static int suicide = 5;
	

	
	public int ch1_skill1(Character_Data chara1)//"�}���ӧQ���C�]�������q\n\n\t�S��3\t�Ӧ^�X���������@��"
	{
		//�S��MODE
		System.out.println("�}���ӧQ���C");
		int mode = attack_all;
		return mode;
	}
	public int ch1_skill2()//
	{
		System.out.println("no_skill");
		int mode = no_skill;
		return mode;
	}
	public int ch2_skill1(Character_Data chara1)//"�t�̪��Ʀr�]�������q\n\n\t�S��2\t�W�[�ۨ�����20�A30%���v�A�[15",
	{
		System.out.println("�t�̪��Ʀr");
		int mode = general_skill;
		Random rand = new Random();
		if(rand.nextInt(10)<3)
		{
			chara1.set_now_attack(chara1.get_now_attack()+35);
		}
		else
		{
			chara1.set_now_attack(chara1.get_now_attack()+20);
		}
		return mode;
	}
	public int ch2_skill2()//
	{
		System.out.println("no_skill");
		int mode = 0;
		return mode;
	}
	public int ch3_skill1(Character_Data chara1)//"�������H���]�������q\n\n\t�S��3\t���C�ۨ�15��q\n\t\t�Ӧ^�X�W�[40����",
	{
		System.out.println("�������H��");
		int mode = general_skill;
		chara1.set_now_attack(chara1.get_now_attack()+40);
		chara1.set_hp(chara1.get_hp() - 15);
		return mode;
	}
	public int ch3_skill2()//
	{
		System.out.println("no_skill");
		int mode = no_skill;
		return mode;
	}
	public int ch4_skill1(Character_Data chara1)//"���M�h�]�������q\n\n\t�S��2\t�W�[�ۨ�����25",
	{
		System.out.println("���M�h");
		int mode = general_skill;
		chara1.set_now_attack(chara1.get_now_attack()+25);
		return mode;
	}
	public int ch4_skill2()//
	{
		System.out.println("no_skill");
		int mode = no_skill;
		return mode;
	}
	public int ch5_skill1(Character_Data chara1)//"�����]�������q\n\n\t�S��2\t�ۨ���q���10�I�A�����O�W�[30",
	{
		System.out.println("����");
		int mode = general_skill;
		chara1.set_now_attack(chara1.get_now_attack()+30);
		chara1.set_hp(chara1.get_hp() - 10);
		return mode;
	}
	public int ch5_skill2(Character_Data chara1,Character_Data chara2)//"�ˤv���H�]�����B���m���q\n\n\t�S��3\t�ۨ���q�k�s\n\t\t�^�Ф@�W����  30��",
	{
		System.out.println("�ˤv���H");
		int mode = suicide;
		if(chara2.get_hp()>0);
		{
			chara2.set_hp(chara2.get_hp() + 30);
		}
		chara1.set_hp(0);
		return mode;
	}
	public int ch6_skill1(Character_Data chara1,Character_Data chara2,Character_Data chara3)//�u�@�}���]���m���q\n\n\t�S��2\t�W�[���騾�m10",
	{
		System.out.println("�u�@�}��");
		int mode = general_skill;
		chara1.set_now_defence(chara1.get_now_defence() +10 );
		chara2.set_now_defence(chara2.get_now_defence() +10 );
		chara3.set_now_defence(chara3.get_now_defence() +10 );
		return mode;
	}
	public int ch6_skill2(Character_Data chara1)//"�Ȧ⤧�á]�������q\n\n\t�S��2\t�W�[�ۨ�����20",
	{
		System.out.println("�Ȧ⤧��");
		int mode = general_skill;
		chara1.set_now_attack(chara1.get_now_attack()+20);
		return mode;
	}
	public int ch7_skill1(Character_Data chara1)//"�ǩӪ����֡]�������q\n\n\t�S��1\t�W�[�ۨ�����10",
	{
		System.out.println("�ǩӪ�����");
		int mode = general_skill;
		chara1.set_now_defence(chara1.get_now_defence() +10 );
		return mode;
	}
	public int ch7_skill2(Character_Data chara1,Character_Data chara2,Character_Data chara3)//"�d�˪������]�������q\n\n\t�S��3\t�ۨ���q�k�s\n\t\t�ڤ����^�_15��",
	{
		System.out.println("�d�˪�����");
		int mode = suicide;
		
		if(chara2.get_hp()>0);
		{
			chara2.set_hp(chara2.get_hp() + 15);
		}
		if(chara3.get_hp()>0);
		{
			chara3.set_hp(chara3.get_hp() + 15);
		}
		chara1.set_hp(0);
		return mode;
	}
	public int ch8_skill1(Character_Data chara1,Character_Data chara2)//"�v¡���n�]���m�B�������q\n\n\t�S��2\t�^�_��@����10��q",
	{
		System.out.println("�v¡���n");
		int mode = general_skill;
		chara2.set_hp(chara2.get_hp() + 10);
		return mode;
	}
	public int ch8_skill2(Character_Data chara1,Character_Data chara2)//"�ܤơ]�������q\n\n\t�S��3\t�@�^�X���N�ۨ������O�ƭ�\n\t\t�ܬ��v��䤤�@�H",
	{
		System.out.println("�ܤ�");
		int mode = general_skill;
		chara1.set_now_attack(chara2.get_attack());
		return mode;
	}
	public int ch9_skill1(Character_Data chara1)//"�t�M���֡]���m���q\n\n\t�S��1\t�ۨ��Ӧ^�X�W�[10���m",
	{
		System.out.println("�t�M����");
		int mode = general_skill;
		chara1.set_now_defence(chara1.get_now_defence()+10);
		return mode;
	}
	public int ch9_skill2(Character_Data chara1)//"���s�M�h�]���m���q\n\n\t�S��3\t���m�W�[5�A�N�Ĥ�����ಾ�ܦۨ�",
	{
		System.out.println("���s�M�h");
		int mode = change_attack;
		return mode;
	}
	public int ch10_skill1(Character_Data chara1,Character_Data chara2)//"��ݺ믫�]���m���q\n\n\t�S��2\t���ɤv��@�H���m15",
	{
		System.out.println("��ݺ믫");
		int mode = general_skill;
		chara2.set_now_defence(chara2.get_now_defence()+15);
		return mode;
	}
	public int ch10_skill2(Character_Data chara1)//"�t�M�u�@�̡]�����B���m���q\n\n\t�S��3\t��o����/���m��  �U2��",
	{
		System.out.println("�t�M�u�@��");
		int mode = add_dise;
		return mode;
	}
	public int ch11_skill1(Character_Data chara1,Character_Data chara2)//"�û������˶��]�����B���m���q\n\n\t�S��3   ���w�@�H�^�_15��",
	{
		System.out.println("�û������˶�");
		int mode = general_skill;
		chara2.set_hp(chara2.get_hp()+15);
		return mode;
	}
	public int ch11_skill2(Character_Data chara1,Character_Data chara2)//"���]���l�]�������q\n\n\t�S��2\t�W�[�@�H����20",
	{
		System.out.println("���]���l");
		int mode = general_skill;
		chara2.set_now_attack(chara2.get_now_attack()+20);
		return mode;
	}
	public int ch12_skill1(Character_Data chara1,Character_Data chara2)//"���A�G���R���]���m���q\n	\n\t�S��2\t���w�@�H���m�W�[30\n\t\t�ۨ���q��10",
	{
		System.out.println("���A�G���R��");
		int mode = general_skill;
		chara2.set_now_defence(chara2.get_now_defence()+30);
		chara1.set_hp(chara1.get_hp()-10);
		return mode;
	}
	public int ch12_skill2(Character_Data chara1,Character_Data chara2)//"�`�ꤧ�d�]�������q\n\n\t�S��3\t���w�@�H�����W�[40\n\t\t���w���H��q��20",
	{
		System.out.println("�`�ꤧ�d");
		int mode = general_skill;
		chara2.set_now_attack(chara2.get_now_attack()+40);
		chara2.set_hp(chara2.get_hp()-20);
		return mode;
	}
	
	
}
