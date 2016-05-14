package com.fun.set1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

import com.fun.datastructure.TreeNode;

/**
 * Given a binary tree node, invert it. Means, exchange left node to right, and
 * right to left. Repeat the same for all child nodes too. 
 *        1
 *       / \
 *      2   3
 *     / \ / \ 
 *    4  5 6  7
 * 
 * After invert operation, it becomes
 *        1
 *       / \
 *      3   2
 *     / \ / \ 
 *    7  6 5  4
 */
public class Problem018 {
  public void invert(TreeNode node) {
    // TODO: invert the node.
  }

  @Test
  public void test1() {
    TreeNode node = new TreeNode(1);
    invert(node);
    assertEquals(node.value, 1);
    assertNull(node.left);
    assertNull(node.right);
  }

  @Test
  public void test2() {
    TreeNode node = new TreeNode(1);
    node.left = new TreeNode(2);
    node.right = new TreeNode(3);
    invert(node);
    assertEquals(node.inorder(), "312");
    assertEquals(node.preorder(), "132");
  }

  @Test
  public void test3() {
    TreeNode node = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    node2.left = new TreeNode(4);
    node2.right = new TreeNode(5);
    TreeNode node3 = new TreeNode(3);
    node3.left = new TreeNode(6);
    node3.right = new TreeNode(7);
    node.left = node2;
    node.right = node3;

    invert(node);
    assertEquals(node.inorder(), "7361524");
    assertEquals(node.preorder(), "1376254");
  }

  @Test
  public void test4() {
    TreeNode node = createNode(9, 1);
    invert(node);
    assertEquals(node.inorder(),
        "10235111022255102151010201271019509101825410175081016631015507101"
        + "4253101350610121261011505101025210095041008311007503100625110055021004125100350110022501"
        + "0015001000629994999982499974989961249954979942489934969921599149599024798949498812398749"
        + "3986246985492984619834919822459814909801229794899782449774889763097548797424397348697212"
        + "1971485970242969484968609674839662419654829641209634819622409614809607959479958239957478"
        + "9561199554779542389534769525995147595023794947494811894747394623694547294429943471942235"
        + "9414709401179394699382349374689365893546793423393346693211693146593023292946492814927463"
        + "9262319254629241159234619222309214609205791945991822991745891611491545791422891345691228"
        + "9114559102279094549081139074539062269054529045690345190222590145090011289944989822489744"
        + "8896389544789422389344689211189144589022288944488855887443886221885442884110883441882220"
        + "8814408802787943987821987743887610987543787421887343687254871435870217869434868108867433"
        + "8662168654328641386343186221586143086010785942985821485742885653855427854213853426852106"
        + "8514258502128494248482684742384621184542284410584342184221084142084052839419838209837418"
        + "8361048354178342088334168326831415830207829414828103827413826206825412824518234118222058"
        + "2141082010281940981820481740881625815407814203813406812101811405810202809404808508074038"
        + "0620180540280410080340180220080140080012799399798199797398796997953977941987933967924979"
        + "1395790197789394788987873937861967853927842478339178219578139078097779389778194777388776"
        + "4877538777419377338677296771385770192769384768176738376619176538276495763381762190761380"
        + "7604775937975818975737875694755377754188753376752237513757501877493747489374737374618674"
        + "5372744467433717421857413707409273936973818473736873611735367734183733366732917313657301"
        + "8272936472845727363726181725362724907233617221807213607202271935971817971735871689715357"
        + "7141787133567124471135571017770935470888707353706176705352704570335170217570135070087699"
        + "3496981746973486964369534769417369334669286691345690172689344688216873436861716853426848"
        + "5683341682170681340680426793396781696773386768467533767416867333667210671335670167669334"
        + "6688366733366616666533266441663331662165661330660826593296581646573286562065532765416365"
        + "3326652816513256501626493246484064732364616164532264480643321642160641320640263931963815"
        + "9637318636796353176341586333166323963131563015762931462878627313626156625312624196233116"
        + "2215562131062077619309618154617308616386153076141536133066127661130561015260930460896073"
        + "0360615160530260475603301602150601300600375992995981495972985967459529759414859329659218"
        + "5912955901475892945887358729358614658529258436583291582145581290580725792895781445772885"
        + "7645752875741435732865727157128557014256928456835567283566141565282564705632815621405612"
        + "8056017559279558139557278556695552775541385532765523455127555013754927454868547273546136"
        + "5452725448543271542135541270540675392695381345372685363353526753413353326653266531265530"
        + "1325292645281652726352613152526252465523261522130521260520325192595181295172585166451525"
        + "7514128513256512");
    assertEquals(node.preorder(),
        "137153163127255511102310225101021102025450910191018508101710161262535071015101450610131012"
        + "2525051011101050410091008621252515031007100650210051004250501100310025001001100012424949"
        + "9999998498997996248497995994496993992306112324749599199049498998824649398798649298598412"
        + "2245491983982490981980244489979978488977976601212434879759744869739722424859719704849699"
        + "6812024148396796648296596424048196396248096196014295911923947995995847895795623847795595"
        + "4476953952118237475951950474949948236473947946472945944581172354719439424709419402344699"
        + "3993846893793611623346793593446693393223246593193046492992828571152314639279264629259242"
        + "3046192392246092192011422945991991845891791622845791591445691391256113227455911910454909"
        + "9082264539079064529059041122254519039024509019002244498998984488978966132755111223447895"
        + "8944468938922224458918904448898881102214438878864428858842204418838824408818805410921943"
        + "9879878438877876218437875874436873872108217435871870434869868216433867866432865864265310"
        + "7215431863862430861860214429859858428857856106213427855854426853852212425851850424849848"
        + "5210521142384784642284584421042184384242084184010420941983983841883783620841783583441683"
        + "3832122551103207415831830414829828206413827826412825824102205411823822410821820204409819"
        + "8184088178165010120340781581440681381220240581181040480980810020140380780640280580420040"
        + "1803802400801800244999199399799798398797796198397795794396793792981973957917903947897881"
        + "9639378778639278578448971953917837823907817801943897797783887777769619338777577438677377"
        + "2192385771770384769768251123479519138376776638276576419038176376238076176094189379759758"
        + "3787577561883777557543767537524693187375751750374749748186373747746372745744921853717437"
        + "4237074174018436973973836873773622459118336773573436673373218236573173036472972890181363"
        + "7277263627257241803617237223607217204489179359719718358717716178357715714356713712881773"
        + "5571171035470970817635370770635270570410214387175351703702350701700174349699698348697696"
        + "8617334769569434669369217234569169034468968842851713436876863426856841703416836823406816"
        + "8084169339679678338677676168337675674336673672204183167335671670334669668166333667666332"
        + "6656648216533166366233066166016432965965832865765640811633276556543266536521623256516503"
        + "2464964880161323647646322645644160321643642320641640491939791593196396383186376361583176"
        + "3563431663363278157315631630314629628156313627626312625624387715531162362231062162015430"
        + "9619618308617616761533076156143066136121523056116103046096081837751513036076063026056041"
        + "5030160360230060160074149299599598298597596148297595594296593592367314729559159029458958"
        + "8146293587586292585584721452915835822905815801442895795782885775768173571143287575574286"
        + "5735721422855715702845695687014128356756628256556414028156356228056156034691392795595582"
        + "7855755613827755555427655355268137275551550274549548136273547546272545544163367135271543"
        + "5422705415401342695395382685375366613326753553426653353213226553153026452952832651312635"
        + "2752626252552413026152352226052152064129259519518258517516128257515514256513512");
  }

  private TreeNode createNode(int level, int value) {
    TreeNode node = new TreeNode(value);
    if (level > 0) {
      node.left = createNode(level - 1, value * 2);
      node.right = createNode(level - 1, value * 2 + 1);
    }
    return node;
  }
  
  @Test
  public void test5() {
    TreeNode node = createNode2(9, 1);
    invert(node);
    assertEquals(node.inorder(),
        "918367214428857611525214284168336672134411459018036072014402393186372744148847189378756151"
        + "2953817621524191765153038315337671535127541082164328641728145711422845691218242911723446"
        + "8936187259237474948189611947795419082399571914479191795919194811623246481296259241165330"
        + "6601320264083333666133226641676691338267633513412682671268513432687132434869721944388812"
        + "2489978195639122459811962392449119653930983393319673935407291458291658323651461292258447"
        + "3129255850146358532927585512121874374874810944377875421898757437987593646561131223281131"
        + "25656313127109319683984219685328029525984129524");
    assertEquals(node.postorder(),
        "115257628814472361891344672336168844221144072036018090451488744372186931512756378189152476"
        + "2381153076515331535767383191954723115172886443221610854271824912456228114571872936468234"
        + "1171896948474237190895447719149571917191995947923911959291425921296648324162812640132066"
        + "0330165266413326663332676133866926821341268526871343671335167834138881944972486243391219"
        + "5697848939241962981393019653933393519679834912451225832291614587295844292214615850292558"
        + "5358552927146373136587484374218787544377875787594379218910941312265611312513127656332811"
        + "96831968598422952529524984132801093364121401341");
  }
  
  private TreeNode createNode2(int level, int value) {
    TreeNode node = new TreeNode(value);
    if (level > 0) {
      if (value % 3 == 1) {
        node.left = createNode2(level - 1, value * 3 + 1);
        node.right = createNode2(level - 1, value * 3 + 2);
      } else if (value %3 == 2) {
        node.left = createNode2(level - 1, value * 2 + 1);
        node.right = createNode2(level - 1, value * 2 - 1);
      } else {
        node.left = createNode2(level - 1, value * 2);
      }
    }
    return node;
  }
}
