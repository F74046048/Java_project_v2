
public class CreateCharacter {
	
	public Character_Data[] character = new Character_Data[12];
	public Character_skill character_skill = new Character_skill();
	
	public CreateCharacter()
	{
		Character_Data char1 = new Character_Data("�ȷ��",40,35,30,1,
				"�}���ӧQ���C�]�������q\n\n\t�S��3\t�Ӧ^�X���������@��",
				"",
				Character_Data.Atk,Character_Data.no_skill,
				Character_Data.self,Character_Data.no_skill,
				3,0);
		
		Character_Data char2 = new Character_Data("����",40,30,35,1,
				"�t�̪��Ʀr�]�������q\n\n\t�S��2\t�W�[�ۨ�����20�A30%���v�A�[15",
				"",
				Character_Data.Atk,Character_Data.no_skill,
				Character_Data.self,Character_Data.no_skill,
				2,0);
		
		Character_Data char3 = new Character_Data("���w�p�w",50,25,30,1,
				"�������H���]�������q\n\n\t�S��3\t���C�ۨ�15��q\n\t\t�Ӧ^�X�W�[40����",
				"",
				Character_Data.Atk,Character_Data.no_skill,
				Character_Data.self,Character_Data.no_skill,
				3,0);
		
		Character_Data char4 = new Character_Data("�������S",45,30,30,1,
				"���M�h�]�������q\n\n\t�S��2\t�W�[�ۨ�����25",
				"",
				Character_Data.Atk,Character_Data.no_skill,
				Character_Data.self,Character_Data.no_skill,
				2,0);
		
		Character_Data char5 = new Character_Data("�[�p��",35,30,35,2,
				"�����]�������q\n\n\t�S��2\t�ۨ���q���10�I�A�����O�W�[30",
				"�ˤv���H�]�����B���m���q\n\n\t�S��3\t�ۨ���q�k�s\n\t\t�^�Ф@�W����  30��",
				Character_Data.Atk,Character_Data.both,
				Character_Data.self,Character_Data.teammate_1,
				2,3);

		Character_Data char6 = new Character_Data("���}����",35,30,35,2,
				"�u�@�}���]���m���q\n\n\t�S��2\t�W�[���騾�m10",
				"�Ȧ⤧�á]�������q\n\n\t�S��2\t�W�[�ۨ�����20",
				Character_Data.def,Character_Data.Atk,
				Character_Data.teammate_all,Character_Data.self,
				2,2);
		
		Character_Data char7 = new Character_Data("�Z���Z",35,35,30,2,
				"�ǩӪ����֡]�������q\n\n\t�S��1\t�W�[�ۨ�����10",
				"�d�˪������]�������q\n\n\t�S��3\t�ۨ���q�k�s\n\t\t�ڤ����^�_15��",
				Character_Data.Atk,Character_Data.Atk,
				Character_Data.self,Character_Data.self,
				1,3);
		
		Character_Data char8 = new Character_Data("���ڰǵ�",30,30,40,2,
				"�v¡���n�]���m�B�������q\n\n\t�S��2\t�^�_��@����10��q",
				"�ܤơ]�������q\n\n\t�S��3\t�@�^�X���N�ۨ������O�ƭ�\n\t\t�ܬ��v��䤤�@�H",
				Character_Data.both,Character_Data.Atk,
				Character_Data.teammate_1,Character_Data.teammate_1,
				2,3);
		
		Character_Data char9 = new Character_Data("�[�ԫ��w",30,40,30,2,
				"�t�M���֡]���m���q\n\n\t�S��1\t�ۨ��Ӧ^�X�W�[10���m",
				"���s�M�h�]���m���q\n\n\t�S��3\t���m�W�[5�A�N�Ĥ�����ಾ�ܦۨ�",
				Character_Data.def,Character_Data.def,
				Character_Data.self,Character_Data.self,
				1,3);
		
		Character_Data char10 = new Character_Data("�Ħ��",30,35,35,2,
				"��ݺ믫�]���m���q\n\n\t�S��2\t���ɤv��@�H���m15",
				"�t�M�u�@�̡]�����B���m���q\n\n\t�S��3\t��o����/���m��  �U2��",
				Character_Data.def,Character_Data.both,
				Character_Data.teammate_1,Character_Data.self,
				2,3);
		
		Character_Data char11 = new Character_Data("���L",20,35,45,2,
				"�û������˶��]�����B���m���q\n\n\t�S��3   ���w�@�H�^�_15��",
				"���]���l�]�������q\n\n\t�S��2\t�W�[�@�H����20",
				Character_Data.both,Character_Data.Atk,
				Character_Data.teammate_1,Character_Data.teammate_1,
				3,2);
		
		Character_Data char12 = new Character_Data("�өg����",20,40,40,2,
				"���A�G���R���]���m���q\n	\n\t�S��2\t���w�@�H���m�W�[30\n\t\t�ۨ���q��10",
				"�`�ꤧ�d�]�������q\n\n\t�S��3\t���w�@�H�����W�[40\n\t\t���w���H��q��20",
				Character_Data.def,Character_Data.Atk,
				Character_Data.teammate_1,Character_Data.teammate_1,
				2,3);
		
		character[0]=char1;
		character[1]=char2;
		character[2]=char3;
		character[3]=char4;
		character[4]=char5;
		character[5]=char6;
		character[6]=char7;
		character[7]=char8;
		character[8]=char9;
		character[9]=char10;
		character[10]=char11;
		character[11]=char12;
		
	}
}
