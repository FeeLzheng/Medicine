<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page isELIgnored="false"%>
<html>
<head>
<script>
	function submit_form(){
			var form=document.getElementById("form1");
			form.submit();
		}
function onclick1(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi1");
O_info.value=O_info.value+'  '+tishi1.value;
}
function onclick2(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi2");
O_info.value=O_info.value+'  '+tishi1.value;
}
function onclick3(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi3");
O_info.value=O_info.value+'  '+tishi1.value;
}
function onclick4(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi4");
O_info.value=O_info.value+'  '+tishi1.value;
}
function onclick5(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi5");
O_info.value=O_info.value+'  '+tishi1.value;
}
function onclick6(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi6");
O_info.value=O_info.value+'  '+tishi1.value;
}
function onclick7(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi7");
O_info.value=O_info.value+'  '+tishi1.value;
}
function onclick8(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi8");
O_info.value=O_info.value+'  '+tishi1.value;
}
function onclick9(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi9");
O_info.value=O_info.value+'  '+tishi1.value;
}		
function onclick10(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi10");
O_info.value=O_info.value+'  '+tishi1.value;
}
function onclick11(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi11");
O_info.value=O_info.value+'  '+tishi1.value;
}
function onclick12(){ 
var O_info=document.getElementById("Q_info"); 
var tishi1=document.getElementById("tishi12");
O_info.value=O_info.value+'  '+tishi1.value;
}

function click1(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti1");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：食物包括糖类、蛋白质、脂肪和其它微量的微生素矿物质等，其中大量脂肪的吸收是人体致胖的主要因素，而脂肪必须通过小肠内胰脂肪酶分解成甘油单脂后人体才能吸收。奥利司他胶囊是长效和强效的特异性胃肠道脂肪酶抑制剂，它通过与胃中的胃脂肪酶和小肠腔内的胰脂肪酶的活性丝氨酸部位形成共价键，使酶失活，而发挥治疗作用。失活的酶不能将食物中的脂肪（主要是甘油三酯）水解为可吸收的游离脂肪酸和单酰基甘油。未消化的甘油三酯不能被身体吸收，从而减少热量摄入，控制体重。该药并不通过全身吸收发挥药效。脂肪（主要是甘油三酯）水解为可吸收的游离脂肪酸和单酰基甘油。未消化的甘油三酯不能被身体吸收，从而减少热量摄入，控制体重。";
}
function click2(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti2");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：海正药业奥利司他片通过国内7家临床试验机构科学验证，在开始服用时就开始起作用，而阻止食物的脂肪吸收，在每次0.12g，每日三次的推荐治疗剂量下，奥利司他可以抑制食物中30%脂肪的吸收。可48小时内从大便中见到未吸收的脂肪排出。一般使用6个月减重可达原体重的7.45-10%，六个月腰围减少平均达到2.4寸（8cm）。";
}
function click5(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti5");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：服用奥利司他片可使饮食中未水解的甘油三酯通过肠道,最终随粪便排出体外(稀大便)。因此奥利司他片必须是随餐或进餐前服用，进餐后服用将会减弱奥利司他对脂肪酶抑制作用；或者进餐时食物的脂肪含量少也会导致排油效果不明显。奥利司他对胃肠道其它酶,包括淀粉酶、胰蛋白酶、糜蛋白酶和磷脂酶均无影响.";
}
function click3(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti3");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：相关临床试验指出通过使用2周的奥利司他可以明显减少了能量的摄入，减轻体重，持续服用两年并明显保持体重.减肥成功后，还需要坚持服用，已达到维持体重，维持时间为两年。并在高脂饮食时需随时服用。改变减肥期间的饮食习惯，如减肥成功后的暴饮暴食是引起减肥失败的主要原因之一。减肥达到预定目标后，要继续保持减肥期间的饮食习惯，要保持恒定或适当减少能量的摄入。减肥目标的设定要有阶梯的过程，达到一个目标后再设定下一阶段的目标。一般一周减重不宜超过0.5斤。减重并不困难，关键是减重后并且维持减去后的体重，这才是决定疗程的关键，并非短时间解决问题那么轻松。";
}
function click4(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti4");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：在一项为期2年的临床研究中，奥利司他组在两周之内体重减轻十分显著并在整个研究期间得以保持。早期的体重减少预示长期治疗结果较好，还需要长期坚持服用以及合理健康饮食。尽管奥利司他是一个减少营养吸收药，作用于胃肠道，为胰腺酶和其它脂肪酶抑制剂，主要阻止脂肪酶的催化分解，抑制由饮食摄入的约三分之一的脂肪吸收。但是由于每个人的身体吸收水平不一致，服用之后分解脂肪酶也会不一致，短时间内也就会出现体重没有减轻的症状。";
}
function click6(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti6");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：相关临床试验指出通过使用2周的奥利司他可以明显较少了能量的摄入，减轻体重，还需要通过增加能量消耗、合理饮食来维持，并持续服用两年并明显保持体重。如果体重减轻后不注意控制饮食量和结构的控制，很容量导致体重加重。";
}
function click7(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti7");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：研究显示奥利司他对乙醇、地高辛、甘油、硝苯地平（缓释片）、口服避孕药、苯妥英或华法令的药动学和/或药效学没有影响。奥利司他使普伐他汀在生物利用度和降低血脂方面有一定的增加。乙醇不影响奥利司他的药效学。";
}
function click8(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti8");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：因奥利司他会减少脂肪的吸收，因此会影响食物中脂溶性维生素的吸收，例如维生素A、D和E等。使用本品同时可加以补充。可在服用本品2小时后或在睡前服用。";
}
function click9(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti9"); 
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：由于奥利司他仅作用于胃肠道，不作用于大脑，几乎不进入血液，所以最常见的不良反应是胃肠道反应，多为油性斑点和油性大便，这也是奥利司他在胃肠道抑制脂肪的吸收，发挥其药物作用的表现，这些副作用大多为轻度的，且通常发生在治疗早期，可自行缓解。";
}
function click10(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti10");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：本品为片剂装，药片能一分为二，使用者可根据进食情况调节剂量，易吸收、方便无浪费，而胶囊显然没有这样的便利，而且服用胶囊也会出现吞咽困难。此外奥利司他片采取纯天然发酵工艺生产，奥利司他胶囊则是通过化学合成工艺生产。";
}
function click11(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti11");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：服用奥利司他片能减少脂肪的吸收，没有分解的脂肪颗粒就从大便中排出，因此排油或者油性大便是奥利司他片疗效的反映。当排油或油性大便过多时，必须严格控制脂肪的摄入量。测定粪便中脂肪含量提示奥利司他的药效在给药后24-48小时即可体现。停止用药后48-72小时粪便中脂肪含量便恢复到治疗前水平。";
}
function click12(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti12");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：当奥利司他与高脂成分饮食（比如一天2000卡热能中，超过30％的热能来源于67克以上的脂肪供给）合用时，发生胃肠道事件（见不良反应）的可能怀会增加。每日脂肪摄入量应分布在三顿主餐中。当奥利司他与脂肪含量很高的某一餐同服时，发生胃肠道反应的可能性增加。因此需要注意脂肪类食物的摄入。水果等为含大量水份和糖类，服用奥利司他片期间可正常食用。";
}
function click13(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti13");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：常见的不良反应为：油性斑点，胃肠排气增多，大便紧急感，脂肪（油）性大便，脂肪泄，大便次数增多和大便失禁。通常在服用奥利司他的病人中较多出现的胃肠道急性反应有：腹痛、腹部不适、胃肠胀气、水样便、软便、直肠痛、直肠部不适、牙齿不适、牙龈不适。";
}
function click14(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti14");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：服用奥利司他可以降低与肥胖相关的危险因素和与肥胖相关的其它疾病的发病率，包括高胆固醇血症、2型糖、心脏病。相关临床试验表明患者使用24周后收缩压和舒张压均发生明显下降；使用奥利司他24周后患者的总胆固醇、高密度脂蛋白胆固醇和低密度脂蛋白胆固醇均较治疗前均有降低；另外患者使用奥利司他后空腹血糖受损（IFG）和糖耐量异常(IGT)的人群经24周奥利司他的治疗后，糖化血红蛋白和餐后2小时血糖没有明显变化。";
}
function click15(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti15");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：奥利司他结合微低热能饮食适用于肥胖和体重超重者包括那些已经出现与肥胖相关的危险因素的患者的长期治疗。奥利司他具有长期的体重控制（减轻体重、维持体重和预防反弹）的疗效。病人的膳食应营养均衡，微低热能，大约30％热能来自脂肪，食物中应富含水果和蔬菜。脂肪、碳水化合物和蛋白质的摄入应分布于每日三餐。";
}
function click16(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti16");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：根据相关临床试验结果表明，患者在停药半年后可以怀孕。";
}
function click17(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti17");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：有些患者在服用奥利司他后可能会引起尿液中的草酸盐增高，因此对患有高草酸尿血症或肾结石病史的患者慎用。";
}
function click18(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti18");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：本品每片含主要成份奥利司他0.12g，辅料为乳糖等，压制成片剂。";
}
function click19(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti19");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：大约所服剂量的97％从粪便排泄，其中83％是原形奥利司他，奥利司他所有相关物的累计肾排泄量低于2％。药物彻底排出（粪便和尿液）需要3－5天。";
}
function click20(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti20");
O_info.value=O_info.value+'  '+ti1.value+'--'+"标准解答：感冒会引起上呼吸道感染,在感冒期间使用奥利司他会导致上呼吸道感染加重；在中暑期间使用奥利司他也会加重患者的病情。";
}
function click21(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti21");
O_info.value=O_info.value+'  '+ti1.value+'--'+"成人：餐时或后1小时内口服1片。如果有一餐未进或食物中不含脂肪，则可省略一次服药。";
}
function click22(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti22");
O_info.value=O_info.value+'  '+ti1.value+'--'+"答：奥利司他口服不吸收，吸收也是微量的M1代谢物，因此奥利司他会是以原型的形式从大便排出，因此服药期间不应该出现尿频、尿痛（颜色变菊红色）的现象，如果出现这种现在，应该是病人自己出现了沁尿系统的感染等原因。有这种情况时，应该马上上报公司药品不良反应监测部门。";
}
function click23(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti23");
O_info.value=O_info.value+'  '+ti1.value+'--'+"奥利司他为胃肠脂肪酶抑制剂，服用后会影响脂肪的吸收，如果病人胃肠消化吸收不好，容易导致营养不良，因此如再服用奥利司他极容易导致营养缺乏的发生。所以不建议服用。";
}
function click24(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti24");
O_info.value=O_info.value+'  '+ti1.value+'--'+"奥利司他只能减少经口食入的脂肪吸收，也就是说它的直接作用是抑制饮食中的脂肪吸收，以配合运动和节食，经过长时间的坚持，能消耗体内脏器的脂肪，但这个前提是必须严格控制饮食和运动相结合。";
}
function click25(){ 
var O_info=document.getElementById("Q_info"); 
var ti1=document.getElementById("ti25");
O_info.value=O_info.value+'  '+ti1.value+'--'+"人体需要均衡的营养，因此如果已经不吃油类的食物时，就不能再吃奥利司他，否则容易造成营养不良。";
}
function clic1(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t1");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：硫酸氨基葡萄糖与盐酸氨基葡萄糖在生产工艺、组成成分和临床疗效方面均存在明显差异。硫酸氨基葡萄糖需要以盐酸氨基葡萄糖为原料，经过多步反应制得，因此硫酸氨基葡萄糖除了增加了硫酸根，还具有比盐酸氨基葡萄糖更稳定的晶体结构，这两个特点对药物的疗效至关重要。硫酸根是人体利用氨基葡萄糖合成关节软骨成分蛋白聚糖的重要原料，硫酸根的存在确保了关节软骨的弹性，因此补充硫酸根对关节软骨的代谢和功能有促进作用。硫酸氨基葡萄糖特有的晶体结构确保了药物在体内得以快速溶解和充分吸收，使得有效成分（氨基葡萄糖和硫酸根）在关节腔中能够迅速而持久地维持在有效治疗浓度，从而达到更好的治疗效果。目前国内外大量临床研究的结果显示，硫酸氨基葡萄糖治疗骨关节炎的疗效优于盐酸氨基葡萄糖，同时疗效更加稳定；二者在疗效方面的差异受到了临床专家的广泛认可。";
}
function clic2(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t2");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：硫酸氨基葡萄糖胶囊治疗骨关节炎必须长期用药，才能够获得理想的效果。一般在连续足量服用药物6个月之后达到理想水平，镇痛的疗效会随着持续服药而维持；此外，硫酸氨基葡萄糖独有的保护软骨、防止关节结构破坏的作用是其治疗骨关节炎最大的特有优势，而达到这一效果需要连续服药至少2年。因此，硫酸氨基葡萄糖的安全性决定了其适合长期服用，而其起效的时间特点决定了必须长期服用才能获得理想的治疗效果。骨关节炎是一种退行性疾病，一旦确诊，需要长期服药治疗，本品服用1个疗程（12周）后，除非患者无法耐受（即出现不良反应），否则不需要停药。本品说明书中已注明：“口服，餐时服用，每日三次每次2粒，连续服用4~12周或根据需要延长，每年重复治疗2~3次。”注意，“根据需要延长”并没有明确规定延长时间，这意味着如果安全性良好可以根据治疗需要持续服用，而“每年重复治疗2~3次”也是最低要求。目前的临床研究数据表明，硫酸氨基葡萄糖治疗骨关节炎应该持续服药2年以上以获得理想的治疗效果。";
}
function clic3(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t3");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：硫酸氨基葡萄糖的原料为几丁质，又名甲壳质。自然界中，甲壳质存在于低等植物菌类、藻类的细胞，甲壳动物虾、蟹、昆虫的外壳，高等植物的细胞壁等，其量不低于丰富的纤维素，是除纤维素以外的又一大类重要多糖。制药行业使用的甲壳质一般提取自于甲壳类动物（不是贝壳，而是虾蟹）的外壳（即外骨骼）。使用甲壳质生产氨基葡萄糖的工艺过程需要经历很多道强酸强碱处理，期间大部分杂质已完全去除，获得的氨基葡萄糖纯度较高，可能残余的致敏物质少之又少。对海鲜过敏的人群主要是对海洋动物的蛋白过敏，而在氨基葡萄糖生产的工艺过程中海洋动物蛋白已经完全去除，所以对海鲜过敏的人服用氨基葡萄糖导致过敏反应的几率微乎其微。但是，不排除有极个别患者对氨基葡萄糖过敏，服药后一旦发生过敏反应，请立即赴医院就医处理，并与我们联系，同时将剩余药物保存以备检验。";
}
function clic4(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t4");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：硫酸氨基葡萄糖作为一种人体内原本就存在的生理性物质，具有其他药物所不具有的优异的安全性，在国外，氨基葡萄糖类产品（所谓氨糖）可以作为保健品销售，人人都可以服用，副作用罕见，安全性极佳。目前在临床研究中观察到的硫酸氨基葡萄糖副作用包括：胃肠道刺激、恶心或者便秘；较为少见的嗜睡以及极为罕见的过敏反应。胃肠道刺激可以通过合理服药来预防，也就是不要空腹服用药物（建议在餐时服用）。如果您在服药后出现罕见的不良反应如嗜睡、过敏反应或其他目前尚未知晓的不良事件（由于无法判断与药物之间的因果关系，暂且称之为不良事件而非不良反应），则应立即停用药物、赴医院就医进行处理，并与我们联系，同时将剩余药物保存已备检验。";
}
function clic5(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t5");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：服用硫酸氨基葡萄糖出现疗效波动，可能有如下几个方面的原因：①环境或其他原因导致的疾病进展（恶化）。由于受到饮食或者风寒刺激、过度运动或者感染、炎症导致病情恶化特别是阶段性的症状加重，表现为治疗效果的反复。②服药方式改变。硫酸氨基葡萄糖主要是通过改善关节软骨的功能来发挥治疗作用的，这一过程需要长时间的积累、足量长期服用硫酸氨基葡萄糖才能获得效果，任何降低剂量、停药或者改变服药方式的行为都有可能影响硫酸氨基葡萄糖的疗效。③阶段性的症状反复并不代表药物的疗效下降。硫酸氨基葡萄糖作为一种改善病情的抗骨关节药物，其与一般的镇痛麻醉药物最大的不同在于其针对的是骨关节炎疾病的核心病理改变--关节软骨退变（所以说它是一种治本的药物而非像镇痛药那样治标不治本）。硫酸氨基葡萄糖主要的疗效指标为保护软骨、防止关节结构破坏。关节软骨的退变程度与患者自觉症状（如疼痛、功能障碍）没有必然联系，需要通过X光或者核磁共振（MRI）等影像学技术手段客观评价。";
}
function clic6(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t6");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：骨关节炎是一种慢性的退行性疾病，这种疾病的治疗需要坚持非药物疗法（减重、行为管理、合理运动等）与药物疗法并重的治疗方式。根据目前国内外开展的大量临床试验的结果，硫酸氨基葡萄糖治疗骨关节炎，其控制症状（即缓解疼痛）的治疗效果，一般在连续足量服用药物6个月之后达到理想水平，镇痛的疗效会随着持续服药而维持；此外，硫酸氨基葡萄糖独有的保护软骨、防止关节结构破坏的作用是其治疗骨关节炎最大的特有优势，而达到这一效果需要连续服药至少2年。";
}
function clic7(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t7");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：硫酸氨基葡萄糖虽然药物名称中有一个“糖”字，但它并不是一种能够提供能量的糖类，更不会参与血糖代谢过程。氨基葡萄糖在体内被身体利用合成关节软骨的重要成分蛋白聚糖，未被身体利用的氨基葡萄糖将被代谢为水和二氧化碳排出体外。临床研究已经证实，在服用硫酸氨基葡萄糖后，人体血糖水平不会出现波动；长期的临床研究发现，无论是否患有糖尿病，在接受硫酸氨基葡萄糖治疗后，患者的血糖控制水平、血压以及血脂水平均不会出现异常。因此，糖尿病患者可以遵医嘱服用硫酸氨基葡萄糖。";
}
function clic8(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t8");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：腰椎间盘突出是因为腰椎间盘各部分（髓核、纤维环及软骨板），尤其是髓核，有不同程度的退行性改变后，在外力因素的作用下，椎间盘的纤维环破裂，髓核组织从破裂之处突出（或脱出）于后方或椎管内，导致相邻脊神经根遭受刺激或压迫，从而产生腰部疼痛，一侧下肢或双下肢麻木、疼痛等一系列临床症状。从本质上来讲，腰椎间盘突出的发病过程中软骨的退化是一个重要环节。硫酸氨基葡萄糖通过促进软骨代谢发挥软骨修复作用，理论上讲应该对腰椎间盘突出具有一定的治疗作用；但是，目前还没有大规模的权威临床研究证明硫酸氨基葡萄糖治疗腰椎间盘突出的疗效。";
}
function clic9(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t9");
O_info.value=O_info.value+'  '+t1.value+'--'+"1.某些药物在胃中易被破坏或对胃有较强刺激性,常制成肠溶胶囊,以确保胶囊到达碱性的十二指肠内才溶解。如把这种胶囊剥开吞服,会降低甚至失去药效,并增加对胃的刺激性,甚至引起胃出血。大部分原因是因为这类药物对食道和胃肠道有刺激性甚至腐蚀性，如治疗骨质疏松的药物等，裸服时药物未到达肠部这个终点站时，沿途对消化道的刺激非常大，尤其是缓释胶囊和肠溶性胶囊，绝对不可剥开服用，否则，损伤了食管和胃粘膜不说，到达肠中时药效已是强驽之末，无法发挥应有的效果。2.同时提醒，千万不要用热水送服，胶囊外壳一般用明胶制成，受热后极易分解，胶囊皮若卡在喉咙或食道中，容易造成灼伤，宜用凉开水或口感有点暖的温开水送服3.这些药装入胶囊，既保护了药物药性不被破坏，也保护了消化器官和呼吸道。去掉胶囊壳可能会造成药物流失、药物浪费、药效降低。";
}
function clic10(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t10");
O_info.value=O_info.value+'  '+t1.value+'--'+"答：氨基葡萄糖尽管其主要活性成分是硫酸氨基葡萄糖，但它可在治疗剂量内被糖尿病患者使用。原因如下：1硫酸氨基葡萄糖是一种天然的、生理状态的氨基单糖，在硫酸根的介导下，相互连接构成硫酸软骨素、硫酸角质素、透明质酸等聚多糖，继而通过中央蛋白的连接组成蛋白多糖聚合体，并与胶原纤维等物质一起构成软骨基质，参与软骨代谢，因此硫酸氨基葡萄糖是软骨代谢中最基本的生理物质。 2在研究硫酸氨基葡萄糖耐受性所观察的5860名患者中，没有血糖增高的病例。3 本身糖尿病患者亦需要糖份，氨基葡萄糖的糖份为极少量，相当于米饭中极小量1.伊索佳在体内代谢不产生葡萄糖：伊索佳的成分是硫酸氨基葡萄糖，它存在于机体内尤其是关节软骨中的氨基单糖，是人体关节软骨基质中合成蛋白聚糖所必需的重要成分。伊索佳在体内的代谢产物只要是二氧化碳、水、尿素，不会分解产生葡萄糖，骨对血糖无直接影响； 2.降糖药不影响伊索佳的吸收、起效：糖尿病患者服用的降糖药物如拜糖平、二甲双胍等，作用是抑制食物内多糖的分解，使糖在肠道内的吸收减缓，以减少餐后血糖升高。伊索佳不需分解直接从小肠吸收入血，因此降糖药不会影响伊索佳硫酸氨基葡萄糖胶囊的吸收和起效；3.服用时注意监测血糖：但有研究称，氨基葡糖糖对胰岛素的释放可能有影响，故在服用伊索佳期间，应该注意监测血糖，根据血糖变化及时调整用药，以免影响病情。 ";
}
function clic11(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t11");
O_info.value=O_info.value+'  '+t1.value+'--'+"答：1.多食：含硫的食物，如芦笋、鸡蛋、大蒜、洋葱。因为骨骼、软骨和结缔组织的修补与重建都要以硫为原料，同时硫也有助于钙的吸收。禁服：铁或含铁的复合维生素。因为铁与疼痛、肿胀和关节损伤有关。茄属蔬菜，如西红柿、土豆、茄子、辣椒等及烟草中的生物碱能使关节炎症状加重。";
}
function clic12(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t12");
O_info.value=O_info.value+'  '+t1.value+'--'+"答：1.有严重肝、肾功能不全的患者应该在有医疗监护的条件下用药。勿将本品置于儿童能触及的地方。未进行过对肝、肾功能不全患者的研究，伊索佳的毒性学和药动学试验数据未显示出对这些患者的限制。2.孕妇服用要更小心，因为妇女在妊娠过程中滥用药物会对胎儿产生毒性或致畸等作用。";
}
function clic13(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t13");
O_info.value=O_info.value+'  '+t1.value+'--'+"答：口服，最好在进餐时服用，一次1-2粒，一日3次，连续服用4-12周或根据需要延长，每年重复治疗2-3次。";
}
function clic14(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t14");
O_info.value=O_info.value+'  '+t1.value+'--'+"答：1.全身各个部位的骨关节炎，如膝关节、髋关节以及脊柱、腕、手、肩关节和踝关节等阻断骨关节炎的病理过程，缓解骨关节的疼痛、改善关节功能、阻止骨关节炎的发展修复关节软骨；";
}
function clic15(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("t15");
O_info.value=O_info.value+'  '+t1.value+'--'+"答：本药为天然的氨基单糖，是人体关节软骨基质中合成蛋白聚糖所必需的重要成分。氨基单糖可刺激软骨细胞产生具有正常多聚体结构的糖蛋白，抑制某些可损害关节软骨的酶(如胶原酶和磷脂酶A2)，抑制损伤细胞的超氧化物自由基的产生，防止皮质激素及某些非甾体类抗炎药对软骨细胞的损害，减少损伤细胞的内毒素因子的释放。";
}
function clico1(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("to1");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：服用通络生骨胶囊之后效果不佳，可能的原因包括：①根据现有的临床研究结果，通络生骨胶囊发挥作用的时间特点为：至少连续服用一个疗程（3个月）才可能出现疼痛症状的改善；至少连续服用2个疗程（半年）以上，才可能会出现影像学上的改善（死骨吸收与新骨生成）；至少服用6~8个疗程（1.5~2年）以上，才可能达到理想的维持效果（避免手术）。因此，短期内通络生骨胶囊疗效不佳的最主要原因可能是服药疗程不足。②疼痛虽然是股骨头坏死的重要症状，但疼痛程度与股骨头内部破坏程度之间并非具有绝对的联系。通络生骨胶囊并非一个强效镇痛药物，其主要作用促进改善微循环和促进骨代谢，修复股骨头内的坏死部分，间接发挥镇痛作用。因此，不能简单通过疼痛程度判断药物是否有效，通络生骨胶囊促进死骨吸收新骨生成的作用必须在服用足2个疗程（半年）以上后，通过影像学（CT、X光、MRI）手段评价。③股骨头坏死是一种难治性疾病，需要采用综合治疗手段，目前已知治疗该疾病的重要前提条件包括严格去除病因（如戒酒、停用激素）以及严格限制负重。通络生骨胶囊的作用机制决定了其对各型股骨头坏死均具有治疗作用，但整体疗效的达成取决于患者的综合病情特点、非药物干预手段（如戒酒、减重减负）、药物治疗的规范性等因素。建议服药患者严格遵从医嘱，保持乐观的心态，积极规范治疗以争取最好的治疗效果。";
}
function clico2(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("to2");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：通络生骨胶囊为中药材木豆叶水提物的硬胶囊剂。木豆叶是豆科植物木豆的干燥叶及嫩枝，木豆本身可以食用。相当于临床剂量的250倍临床前毒理学研究和一般药理学研究中并未观察到通络生骨胶囊的特殊毒性。所以通络生骨胶囊的安全性十分优异。目前尚未观察到通络生骨胶囊与其他药物或者食物之间存在相互作用，因此服用通络生骨胶囊没有“忌口”要求。";
}
function clico3(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("to3");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：通络生骨胶囊的一般治疗方案为每日三次每次4粒，餐后温水送服，连续服用3个月为一疗程。根据现有的临床研究结果，通络生骨胶囊发挥作用的时间特点为：至少连续服用一个疗程（3个月）才可能出现疼痛症状的改善；至少连续服用2个疗程（半年）以上，才可能会出现影像学上的改善（死骨吸收与新骨生成）；至少服用6~8个疗程（1.5~2年）以上，才可能达到理想的维持效果（避免手术）。";
}
function clico4(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("to4");
O_info.value=O_info.value+'  '+t1.value+'--'+"标准解答：疼痛虽然是股骨头坏死的重要症状，但疼痛程度与股骨头内部破坏程度之间并非具有绝对的联系。尽管如此，疼痛仍然很可能是股骨头坏死病情恶化的提示症状之一，建议患者如果出现股骨头疼痛，应及时就医通过影像学（CT、X光、MRI）手段评价疾病进展状态。根据目前的临床资料，通络生骨胶囊没有导致股骨头疼痛的不良反应，因此，股骨头疼痛是由药物导致的可能性不大，无须停药。根据现有的临床研究结果，通络生骨胶囊发挥作用的时间特点为：至少连续服用一个疗程（3个月）才可能出现疼痛症状的改善；至少连续服用2个疗程（半年）以上，才可能会出现影像学上的改善（死骨吸收与新骨生成）；至少服用6~8个疗程（1.5~2年）以上，才可能达到理想的维持效果（避免手术）。有关不同患者服用通络生骨胶囊的最佳疗程数，请患者咨询其主治医生。";
}
function clico5(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("to5");
O_info.value=O_info.value+'  '+t1.value+'--'+"答：谷丙转氨酶（GPT或是ALT）存在于肝脏、心肌或骨骼肌中。肝细胞或某些组织损伤或坏死，都会使血液中的谷丙转氨酶升高。如病毒性肝炎、酒精性肝炎、肝硬化活动期或胆道疾病发生时。谷丙转氨酶是转氨酶中非常重要的一种，它也是肝功能检查中一种常见的检测指标。检查谷丙转氨酶可以判断肝脏是否出现了问题。指导意见：谷丙转氨酶正常参考值为0-40U/L。如谷丙居高不下，应考虑服用合适保肝药物并适时复查肝功能。";
}
function clico6(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("to6");
O_info.value=O_info.value+'  '+t1.value+'--'+"主治活血健骨、化瘀止痛。用于股骨头缺血性坏死，症见髋部活动受限、疼痛、跛行、肌肉萎缩、腰膝酸软、乏力倦怠，舌质偏红或有瘀斑，脉弦。";
}
function clico7(){ 
var O_info=document.getElementById("Q_info"); 
var t1=document.getElementById("to7");
O_info.value=O_info.value+'  '+t1.value+'--'+"1.药物采用通络生骨胶囊（成份木豆叶）。每粒0.5g，40 粒/瓶。每次服用4粒，每日3次，温水送服。6周为1个疗程。治疗1个疗程后观察疗效（1疗程约30盒）";
}

</script>
    <title>个人咨询</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body>
    <br/>
    <div class="mframe">
    
   <!-- <s:form action="search3.action" style="display:inline">
                <input type="text" name="Keyword2" id="Keyword2" class="inputbg" size="40"
                        style="background-color:white"/>&nbsp;
            <input type="submit" value="搜索地区经理电话"  style="background: #E8FF00"/>
            </s:form>
    -->
    
        <table width="90%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;个人咨询信息</span>
                </td>
            </tr>
        </table>
<s:form action="admin_queryEditSave" method="post" target="_parent">     
<input type="hidden" name="D_company" value=${D_company }>
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr>
 
<td width="8%" align="left"><nobr>药品名称： </nobr></td>
<td width="52%"><input type="text" value=${M_name } size="50" name="M_name" readonly="readonly"> <a  href=medicineDetail.action?M_name=${M_name} target="districtDetail">详情</a></td>

</tr>
 
 <tr>


<td width="8%" align="left"><nobr>销售省份： </nobr></td>
<td width="52%"><input type="text"  size="50" name=D_district value=${D_district }><a  href=districtDetail.action?id=${id}&M_name=${M_name}&D_district=${D_district} target="districtDetail"> 详情</a></td>

</tr>
<tr>
<td width="8%" align="left"><nobr>客户姓名： </nobr></td>
<td width="20%"><input type="text" size="50" name="Q_name"  ></td>
</tr>
 

<tr>
<td width="8%" align="left"><nobr>客户所在省份： </nobr></td>
<td width="32%"><input type="text" size="50" name="Q_province" value=${D_district } ><a  href=admin_districtEdit2.action?M_name=${M_name} target="districtDetail">     全国省份详情</a></td>
</tr>
 <tr>
<td width="8%" align="left"><nobr>客户联系电话： </nobr></td>
<td width="32%"><input type="text" size="50" name="Q_iphone" ></td>
</tr>
</table>

  
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr><td><b>个人咨询内容： </b></td>
<s:if test="M_name=='奥利司他片'">
<tr><td>
<input type="button" id="tishi1" value="客户咨询该产品用法用量，建议根据说明书：成人：餐时或后1小时内口服1片。如果有一餐未进或食物中不含脂肪，则可省略一次服药。（奥利司他片）" onclick="onclick1()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi2" value="客户咨询该产品用法用量，建议根据说明书：口服，最好在进餐时服用，一次1-2粒，一日3次，连续服用4-12周或根据需要延长，每年重复治疗2-3次。（硫酸氨基葡萄糖胶囊） " onclick="onclick2()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi3" value="客户咨询该产品生产场地变更事宜" onclick="onclick3()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi4" value="客户咨询该产品真伪查询，建议其自身可通过小盒上的20位电子监管码在中国药品监管平台上查询" onclick="onclick4()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi5" value="客户咨询该产品积分兑换，建议其拨打4008202959自行咨询  " onclick="onclick5()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi6" value="客户咨询该产品是否在生产，咨询购买-转告客户此产品公司暂未生产，感谢其来电" onclick="onclick6()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi7" value="客户咨询该产品广告宣传推广，告知公司相关产品不做媒体宣传及推广，感谢其来电" onclick="onclick7()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi8" value="客户咨询公司原料产品，转告原来销售部门电话，请其自行咨询" onclick="onclick8()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi9" value="客户咨询公司兽药产品，转告原来销售部门电话，请其自行咨询" onclick="onclick9()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi10" value="客户咨询公司农药产品，转告客户农药销售部门电话，请其自行咨询" onclick="onclick10()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi11" value="客户咨询公司外贸产品，转告客户国际部电话，请其自行咨询" onclick="onclick11()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi12" value="客户咨询此产品服用几瓶之后，效果不明显，转告客户此产品服用同时，需要增加适当运动及合理的饮食生活起居，药物只是一种辅助" onclick="onclick12()"> 
</td></tr>
<tr><td><input type="button" id="ti1" value="咨询奥利司他作用机制" onclick="click1()">
<input type="button" id="ti2" value="咨询服用奥利司他片效果？" onclick="click2()"> </td>
</tr>
<tr><td><input type="button" id="ti3" value="咨询奥利司他片服用疗程" onclick="click3()"><input type="button" id="ti4" value="咨询服用奥利司他片第一个月时疗效明显，为什么后来疗效不明显？" onclick="click4()"> </td>
</tr>
<tr><td><input type="button" id="ti5" value="咨询服用后没有明显的排油效果是什么原因？" onclick="click5()"> <input type="button" id="ti6" value="咨询服用奥利司他片达到疗效后会反弹吗？" onclick="click6()"> </td>
</tr>
<tr><td><input type="button" id="ti7" value="咨询服用三高药物、避孕药期间可以服用奥利司他吗?" onclick="click7()"><input type="button" id="ti8" value="咨询服用奥利司他期间需配合复合维生素" onclick="click8()"> </td>
</tr>
<tr><td><input type="button" id="ti9" value="咨询奥利司他片不良反应" onclick="click9()"><input type="button" id="ti10" value="咨询奥利司他片与其他品牌的奥利司他胶囊有什么区别？" onclick="click10()"> </td>
</tr>
<tr><td><input type="button" id="ti11" value="咨询怎样区别排油与不良反应中的油性大便？" onclick="click11()"> <input type="button" id="ti12" value="咨询服用奥利司他片饮食注意事项？" onclick="click12()"> </td>
</tr>
<tr><td><input type="button" id="ti13" value="咨询服用奥利司他片后常见反应是什么？" onclick="click13()"> <input type="button" id="ti14" value="咨询三高、糖尿病、心脏病等患者，是否能服用？" onclick="click14()"> </td>
</tr>
<tr><td><input type="button" id="ti15" value="咨询奥利司他片是否可以长期服用？" onclick="click15()"> <input type="button" id="ti16" value="咨询需停药多久可以怀孕？" onclick="click16()"> </td>
</tr>
<tr><td><input type="button" id="ti17" value="肾结石患者可以服用奥利司他吗？" onclick="click17()"> <input type="button" id="ti18" value="咨询奥利司他主要生产原材料是哪些？" onclick="click18()"> </td>
</tr>
<tr><td><input type="button" id="ti19" value="咨询奥利司他片服用后多久可以完全排出体内？" onclick="click19()"> <input type="button" id="ti20" value="咨询感冒、中暑等病中，是否可以继续服用奥利司他？" onclick="click20()"> </td>
</tr>
<tr><td><input type="button" id="ti21" value="咨询用法用量" onclick="click21()"> <input type="button" id="ti22" value="咨询服用期间出现尿频、尿痛（颜色变菊红色）？" onclick="click22()"> </td>
</tr>
<tr><td><input type="button" id="ti23" value="咨询胃肠消化吸收不好的是否能吃？" onclick="click23()"> <input type="button" id="ti24" value="咨询脂肪肝上的脂肪能减掉么？是否减脏器上的脂肪？" onclick="click24()"> </td>
</tr>
<tr><td><input type="button" id="ti25" value="咨询如果不吃油脂类的的食物只吃淀粉类的食物、甜食，吃来利还有效果么？" onclick="click25()"></td>
</tr>
</s:if>
<s:if test="M_name=='硫酸氨基葡萄糖胶囊'">
<tr><td>
<input type="button" id="tishi1" value="客户咨询该产品用法用量，建议根据说明书：成人：餐时或后1小时内口服1片。如果有一餐未进或食物中不含脂肪，则可省略一次服药。（奥利司他片）" onclick="onclick1()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi2" value="客户咨询该产品用法用量，建议根据说明书：口服，最好在进餐时服用，一次1-2粒，一日3次，连续服用4-12周或根据需要延长，每年重复治疗2-3次。（硫酸氨基葡萄糖胶囊） " onclick="onclick2()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi3" value="客户咨询该产品生产场地变更事宜" onclick="onclick3()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi4" value="客户咨询该产品真伪查询，建议其自身可通过小盒上的20位电子监管码在中国药品监管平台上查询" onclick="onclick4()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi5" value="客户咨询该产品积分兑换，建议其拨打4008202959自行咨询  " onclick="onclick5()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi6" value="客户咨询该产品是否在生产，咨询购买-转告客户此产品公司暂未生产，感谢其来电" onclick="onclick6()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi7" value="客户咨询该产品广告宣传推广，告知公司相关产品不做媒体宣传及推广，感谢其来电" onclick="onclick7()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi8" value="客户咨询公司原料产品，转告原来销售部门电话，请其自行咨询" onclick="onclick8()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi9" value="客户咨询公司兽药产品，转告原来销售部门电话，请其自行咨询" onclick="onclick9()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi10" value="客户咨询公司农药产品，转告客户农药销售部门电话，请其自行咨询" onclick="onclick10()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi11" value="客户咨询公司外贸产品，转告客户国际部电话，请其自行咨询" onclick="onclick11()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi12" value="客户咨询此产品服用几瓶之后，效果不明显，转告客户此产品服用同时，需要增加适当运动及合理的饮食生活起居，药物只是一种辅助" onclick="onclick12()"> 
</td></tr>
<tr><td><input type="button" id="t1" value="咨询盐酸和硫酸的区别？哪个效果好？" onclick="clic1()">
<input type="button" id="t2" value="咨询硫酸氨基葡萄糖胶囊适合长期吃吗？每吃一个疗程要停一个月时间吗？为什么？" onclick="clic2()"> </td>
</tr>
<tr><td><input type="button" id="t3" value="咨询硫酸氨基葡萄糖的成份是否贝壳类动物提取物？会不会引起过敏？" onclick="clic3()"><input type="button" id="t4" value="咨询服用硫酸氨基葡萄糖有副作用吗？有什么副作用？出现副作用怎么处理？" onclick="clic4()"> </td>
</tr>
<tr><td><input type="button" id="t5" value="咨询为什么服用硫酸氨基葡萄糖胶囊一开始挺有效果，后期效果不明显？" onclick="clic5()"> <input type="button" id="t6" value="咨询硫酸氨基葡萄糖吃了一个月没疗效，为什么？" onclick="clic6()"> </td>
</tr>
<tr><td><input type="button" id="t7" value="咨询糖尿病人可以服用硫酸氨基葡萄糖胶囊吗？" onclick="clic7()"><input type="button" id="t8" value="咨询腰椎间盘突出是否可以服用硫酸氨基葡萄糖胶囊？" onclick="clic8()"> </td>
</tr>
<tr><td><input type="button" id="t9" value="咨询硫酸氨基葡萄糖胶囊(伊索佳)胶囊可以剥开吃吗？" onclick="clic9()"><input type="button" id="t10" value="咨询糖尿病人能否服用硫酸氨基葡萄糖胶囊(伊索佳)？" onclick="clic10()"> </td>
</tr>
<tr><td><input type="button" id="t11" value="硫酸氨基葡萄糖胶囊(伊索佳)治骨关节炎时饮食宜忌" onclick="clic11()"> <input type="button" id="t12" value="硫酸氨基葡萄糖胶囊(伊索佳)治疗骨关节炎哪些人群不宜服用？" onclick="clic12()"> </td>
</tr>
<tr><td><input type="button" id="t13" value="咨询硫酸氨基葡萄糖胶囊(伊索佳)的用法、用量、疗程" onclick="clic13()"> <input type="button" id="t14" value="咨询硫酸氨基葡萄糖胶囊(伊索佳)的主治功能" onclick="clic14()"> </td>
</tr>
<tr><td><input type="button" id="t15" value="咨询硫酸氨基葡萄糖胶囊(伊索佳)的主要成分" onclick="clic15()">
</tr>
</s:if>
<s:if test="M_name=='通络生骨胶囊'">
<tr><td>
<input type="button" id="tishi1" value="客户咨询该产品用法用量，建议根据说明书：成人：餐时或后1小时内口服1片。如果有一餐未进或食物中不含脂肪，则可省略一次服药。（奥利司他片）" onclick="onclick1()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi2" value="客户咨询该产品用法用量，建议根据说明书：口服，最好在进餐时服用，一次1-2粒，一日3次，连续服用4-12周或根据需要延长，每年重复治疗2-3次。（硫酸氨基葡萄糖胶囊） " onclick="onclick2()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi3" value="客户咨询该产品生产场地变更事宜" onclick="onclick3()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi4" value="客户咨询该产品真伪查询，建议其自身可通过小盒上的20位电子监管码在中国药品监管平台上查询" onclick="onclick4()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi5" value="客户咨询该产品积分兑换，建议其拨打4008202959自行咨询  " onclick="onclick5()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi6" value="客户咨询该产品是否在生产，咨询购买-转告客户此产品公司暂未生产，感谢其来电" onclick="onclick6()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi7" value="客户咨询该产品广告宣传推广，告知公司相关产品不做媒体宣传及推广，感谢其来电" onclick="onclick7()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi8" value="客户咨询公司原料产品，转告原来销售部门电话，请其自行咨询" onclick="onclick8()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi9" value="客户咨询公司兽药产品，转告原来销售部门电话，请其自行咨询" onclick="onclick9()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi10" value="客户咨询公司农药产品，转告客户农药销售部门电话，请其自行咨询" onclick="onclick10()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi11" value="客户咨询公司外贸产品，转告客户国际部电话，请其自行咨询" onclick="onclick11()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi12" value="客户咨询此产品服用几瓶之后，效果不明显，转告客户此产品服用同时，需要增加适当运动及合理的饮食生活起居，药物只是一种辅助" onclick="onclick12()"> 
</td></tr>
<tr><td><input type="button" id="to1" value="咨询通络生骨胶囊服用2～3周没效果，为什么？" onclick="clico1()">
<input type="button" id="to2" value="咨询服用通络生骨胶囊有什么饮食宜忌？" onclick="clico2()"> </td>
</tr>
<tr><td><input type="button" id="to3" value="咨询通络生骨胶囊的疗程是多久？要服用几个疗程？" onclick="clico3()"><input type="button" id="to4" value="咨询吃了通络生骨胶囊后股骨头那里会痛，是什么原因？还能继续吃吗？" onclick="clico4()"> </td>
</tr>
<tr><td><input type="button" id="to5" value="咨询说明书上的ALT是什么意思？" onclick="clico5()"> <input type="button" id="to6" value="咨询通络生骨胶囊功能" onclick="clico6()"> </td>
</tr>
<tr><td><input type="button" id="to7" value="咨询通络生骨胶囊的用法、用量、疗程" onclick="clico7()"></td>
</tr>

<s:else>
<tr><td>
<input type="button" id="tishi1" value="客户咨询该产品用法用量，建议根据说明书：成人：餐时或后1小时内口服1片。如果有一餐未进或食物中不含脂肪，则可省略一次服药。（奥利司他片）" onclick="onclick1()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi2" value="客户咨询该产品用法用量，建议根据说明书：口服，最好在进餐时服用，一次1-2粒，一日3次，连续服用4-12周或根据需要延长，每年重复治疗2-3次。（硫酸氨基葡萄糖胶囊） " onclick="onclick2()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi3" value="客户咨询该产品生产场地变更事宜" onclick="onclick3()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi4" value="客户咨询该产品真伪查询，建议其自身可通过小盒上的20位电子监管码在中国药品监管平台上查询" onclick="onclick4()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi5" value="客户咨询该产品积分兑换，建议其拨打4008202959自行咨询  " onclick="onclick5()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi6" value="客户咨询该产品是否在生产，咨询购买-转告客户此产品公司暂未生产，感谢其来电" onclick="onclick6()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi7" value="客户咨询该产品广告宣传推广，告知公司相关产品不做媒体宣传及推广，感谢其来电" onclick="onclick7()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi8" value="客户咨询公司原料产品，转告原来销售部门电话，请其自行咨询" onclick="onclick8()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi9" value="客户咨询公司兽药产品，转告原来销售部门电话，请其自行咨询" onclick="onclick9()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi10" value="客户咨询公司农药产品，转告客户农药销售部门电话，请其自行咨询" onclick="onclick10()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi11" value="客户咨询公司外贸产品，转告客户国际部电话，请其自行咨询" onclick="onclick11()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi12" value="客户咨询此产品服用几瓶之后，效果不明显，转告客户此产品服用同时，需要增加适当运动及合理的饮食生活起居，药物只是一种辅助" onclick="onclick12()"> 
</td></tr>
</s:else>
<tr><td><textarea rows="10" cols="100" name="Q_info" id="Q_info"></textarea></td></tr>
<tr><td><input type="submit" value="确认保存" ></td>
<td><input type="reset" value="重新填写"></td>
</tr>

</table>
</s:form>
                    <s:if test="hasFieldErrors()">
                        <hr/>
                        <div align=center style="color:red"><s:fielderror/></div>
                    </s:if>
                    <s:if test="hasActionMessages()">
                        <hr/><div align=center style="color:red">
                            <s:actionmessage/></div>
                        </s:if>
             
               
            
      
        <table width="90%" align="center" cellspacing="0" cellpadding="0" >
            <tr>
                <td class="bl"></td>
                <td class="bm">&nbsp;</td>
                <td class="br">&nbsp;</td>
            </tr>
        </table>
    </div>
</body>
</html>