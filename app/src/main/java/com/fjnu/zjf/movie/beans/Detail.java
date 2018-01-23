package com.fjnu.zjf.movie.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/1/21 0021.
 */

public class Detail {

    /**
     * rating : {"max":10,"average":7.9,"details":{"1":175,"2":435,"3":3568,"4":8961,"5":4031},"stars":"40","min":0}
     * reviews_count : 432
     * videos : []
     * wish_count : 28080
     * original_title : Eye in the Sky
     * blooper_urls : []
     * collect_count : 45802
     * images : {"small":"http://img7.doubanio.com/view/movie_poster_cover/ipst/public/p2411665175.jpg","large":"http://img7.doubanio.com/view/movie_poster_cover/lpst/public/p2411665175.jpg","medium":"http://img7.doubanio.com/view/movie_poster_cover/spst/public/p2411665175.jpg"}
     * douban_site :
     * year : 2015
     * popular_comments : [{"rating":{"max":5,"value":5,"min":0},"useful_count":449,"author":{"uid":"catvoldemort","avatar":"http://img3.doubanio.com/icon/u27220223-207.jpg","signature":"Together we rule the Catlaxy","alt":"http://www.douban.com/people/catvoldemort/","id":"27220223","name":"Darth Meow"},"subject_id":"10484117","content":"完美反映英美政客对于反恐的不同观念和不同决断／讽刺的是让射杀行动变得复杂的小女孩被编剧塑造成了一个家庭思想先进，不拘于生活大环境学习数学会玩呼啦圈的形象，激发观众的同理心，忍不住想如果小女孩是一个早中晚拜阿拉的设定，不知道观众对她的紧张会不会少一些。","created_at":"2016-05-08 07:49:23","id":"1036427212"},{"rating":{"max":5,"value":1,"min":0},"useful_count":606,"author":{"uid":"shooterv","avatar":"http://img7.doubanio.com/icon/u81820885-2.jpg","signature":"","alt":"http://www.douban.com/people/shooterv/","id":"81820885","name":"射手"},"subject_id":"10484117","content":"最不爱看这种没逻辑的电影。执行这种任务的军队都是没有任何温度的非常理性的杀戮机器，怎么可能受到一个小女孩的影响。近两个小时的电影经过朕的无数次快进不到半个小时就看完了。一堆圣母婊浪费了朕宝贵的半小时。你们知道半个小时朕能看多少奏折吗？","created_at":"2016-06-18 14:37:16","id":"1053052776"},{"rating":{"max":5,"value":4,"min":0},"useful_count":117,"author":{"uid":"tjz230","avatar":"http://img3.doubanio.com/icon/u1005928-127.jpg","signature":"微信号：busan-movie（不散）","alt":"http://www.douban.com/people/tjz230/","id":"1005928","name":"影志"},"subject_id":"10484117","content":"\u201c网络视频是革命最好的催化剂。\u201d有《逃出德黑兰》的紧张感，《猎杀本拉登》的纪实感，以及《地雷区》的反思，场景不多却好戏连连。","created_at":"2016-06-12 00:33:26","id":"1051004073"},{"rating":{"max":5,"value":2,"min":0},"useful_count":99,"author":{"uid":"onegirl","avatar":"http://img3.doubanio.com/icon/u1061944-77.jpg","signature":"白首为功名 旧山松竹老","alt":"http://www.douban.com/people/onegirl/","id":"1061944","name":"东遇西"},"subject_id":"10484117","content":"技术上还是有一些可取之处，但流泪之类的情节实在太做作了，设想把卖面包的小女孩换成一个头顶长疮、脚底流脓、托着破碗、沿街乞讨的乞丐，不知道大家还能不能接受这最后一分钟营救并泪如雨下？","created_at":"2016-06-15 11:56:52","id":"1052122527"}]
     * alt : https://movie.douban.com/subject/10484117/
     * id : 10484117
     * mobile_url : https://movie.douban.com/subject/10484117/mobile
     * photos_count : 399
     * pubdate : 2017-01-13
     * title : 天空之眼
     * do_count : null
     * has_video : false
     * share_url : http://m.douban.com/movie/subject/10484117
     * seasons_count : null
     * languages : ["英语"]
     * schedule_url : https://movie.douban.com/subject/10484117/cinema/
     * writers : [{"avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/1459156417.43.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1459156417.43.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1459156417.43.jpg"},"name_en":"Guy Hibbert","name":"盖伊·希伯特","alt":"https://movie.douban.com/celebrity/1286572/","id":"1286572"}]
     * pubdates : ["2015-09-11(多伦多电影节)","2016-03-11(美国)","2016-04-15(英国)","2017-01-13(中国大陆)"]
     * website : www.bleeckerstreetmedia.com/eyeinthesky
     * tags : ["战争","人性","英国","政治","军事","剧情","美国","2015","道德","反恐"]
     * has_schedule : true
     * durations : ["102分钟"]
     * genres : ["剧情","战争"]
     * collection : null
     * trailers : [{"medium":"http://img3.doubanio.com/img/trailer/medium/2412205906.jpg?1484128842","title":"中国预告片 (中文字幕)","subject_id":"10484117","alt":"https://movie.douban.com/trailer/210183/","small":"http://img3.doubanio.com/img/trailer/small/2412205906.jpg?1484128842","resource_url":"http://vt1.doubanio.com/201701212055/89e7111a4a96b96bd5382e16ca208141/view/movie/M/302100183.mp4","id":"210183"},{"medium":"http://img3.doubanio.com/img/trailer/medium/2410835977.jpg?1483874508","title":"中国预告片：悬念版 (中文字幕)","subject_id":"10484117","alt":"https://movie.douban.com/trailer/209989/","small":"http://img3.doubanio.com/img/trailer/small/2410835977.jpg?1483874508","resource_url":"http://vt1.doubanio.com/201701212055/68ee13c04e9eca094680c3586817065c/view/movie/M/302090989.mp4","id":"209989"},{"medium":"http://img7.doubanio.com/img/trailer/medium/2291688464.jpg?","title":"预告片","subject_id":"10484117","alt":"https://movie.douban.com/trailer/187789/","small":"http://img7.doubanio.com/img/trailer/small/2291688464.jpg?","resource_url":"http://vt1.doubanio.com/201701212055/a9246b7c0249adc6398cfde3f7aa06f6/view/movie/M/301870789.mp4","id":"187789"}]
     * episodes_count : null
     * trailer_urls : ["http://vt1.doubanio.com/201701212055/89e7111a4a96b96bd5382e16ca208141/view/movie/M/302100183.mp4","http://vt1.doubanio.com/201701212055/68ee13c04e9eca094680c3586817065c/view/movie/M/302090989.mp4","http://vt1.doubanio.com/201701212055/a9246b7c0249adc6398cfde3f7aa06f6/view/movie/M/301870789.mp4"]
     * has_ticket : true
     * bloopers : []
     * clip_urls : ["http://vt1.doubanio.com/201701212055/089c9b4dd3271439923ad6298bd8163c/view/movie/M/301940123.mp4","http://vt1.doubanio.com/201701212055/53c47e24d515510d860ca7ef4113b973/view/movie/M/301920581.mp4"]
     * current_season : null
     * casts : [{"avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/21169.jpg","large":"http://img3.doubanio.com/img/celebrity/large/21169.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/21169.jpg"},"name_en":"Helen Mirren","name":"海伦·米伦","alt":"https://movie.douban.com/celebrity/1054390/","id":"1054390"},{"avatars":{"small":"http://img3.doubanio.com/img/celebrity/small/1307.jpg","large":"http://img3.doubanio.com/img/celebrity/large/1307.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/1307.jpg"},"name_en":"Aaron Paul","name":"亚伦·保尔","alt":"https://movie.douban.com/celebrity/1049498/","id":"1049498"},{"avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/10644.jpg","large":"http://img7.doubanio.com/img/celebrity/large/10644.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/10644.jpg"},"name_en":"Alan Rickman","name":"艾伦·瑞克曼","alt":"https://movie.douban.com/celebrity/1025153/","id":"1025153"},{"avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/1384941323.0.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1384941323.0.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1384941323.0.jpg"},"name_en":"Barkhad Abdi","name":"巴克德·阿巴蒂","alt":"https://movie.douban.com/celebrity/1335066/","id":"1335066"}]
     * countries : ["英国"]
     * mainland_pubdate : 2017-01-13
     * photos : [{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2368161528.jpg","image":"http://img3.doubanio.com/view/photo/photo/public/p2368161528.jpg","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2368161528.jpg","alt":"https://movie.douban.com/photos/photo/2368161528/","id":"2368161528","icon":"http://img3.doubanio.com/view/photo/icon/public/p2368161528.jpg"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2368160635.jpg","image":"http://img7.doubanio.com/view/photo/photo/public/p2368160635.jpg","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2368160635.jpg","alt":"https://movie.douban.com/photos/photo/2368160635/","id":"2368160635","icon":"http://img7.doubanio.com/view/photo/icon/public/p2368160635.jpg"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2368160559.jpg","image":"http://img3.doubanio.com/view/photo/photo/public/p2368160559.jpg","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2368160559.jpg","alt":"https://movie.douban.com/photos/photo/2368160559/","id":"2368160559","icon":"http://img3.doubanio.com/view/photo/icon/public/p2368160559.jpg"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2368161777.jpg","image":"http://img3.doubanio.com/view/photo/photo/public/p2368161777.jpg","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2368161777.jpg","alt":"https://movie.douban.com/photos/photo/2368161777/","id":"2368161777","icon":"http://img3.doubanio.com/view/photo/icon/public/p2368161777.jpg"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2411681866.jpg","image":"http://img3.doubanio.com/view/photo/photo/public/p2411681866.jpg","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2411681866.jpg","alt":"https://movie.douban.com/photos/photo/2411681866/","id":"2411681866","icon":"http://img3.doubanio.com/view/photo/icon/public/p2411681866.jpg"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2411681351.jpg","image":"http://img7.doubanio.com/view/photo/photo/public/p2411681351.jpg","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2411681351.jpg","alt":"https://movie.douban.com/photos/photo/2411681351/","id":"2411681351","icon":"http://img7.doubanio.com/view/photo/icon/public/p2411681351.jpg"},{"thumb":"http://img7.doubanio.com/view/photo/thumb/public/p2411681342.jpg","image":"http://img7.doubanio.com/view/photo/photo/public/p2411681342.jpg","cover":"http://img7.doubanio.com/view/photo/albumcover/public/p2411681342.jpg","alt":"https://movie.douban.com/photos/photo/2411681342/","id":"2411681342","icon":"http://img7.doubanio.com/view/photo/icon/public/p2411681342.jpg"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2411681339.jpg","image":"http://img3.doubanio.com/view/photo/photo/public/p2411681339.jpg","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2411681339.jpg","alt":"https://movie.douban.com/photos/photo/2411681339/","id":"2411681339","icon":"http://img3.doubanio.com/view/photo/icon/public/p2411681339.jpg"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2411681327.jpg","image":"http://img3.doubanio.com/view/photo/photo/public/p2411681327.jpg","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2411681327.jpg","alt":"https://movie.douban.com/photos/photo/2411681327/","id":"2411681327","icon":"http://img3.doubanio.com/view/photo/icon/public/p2411681327.jpg"},{"thumb":"http://img3.doubanio.com/view/photo/thumb/public/p2411681319.jpg","image":"http://img3.doubanio.com/view/photo/photo/public/p2411681319.jpg","cover":"http://img3.doubanio.com/view/photo/albumcover/public/p2411681319.jpg","alt":"https://movie.douban.com/photos/photo/2411681319/","id":"2411681319","icon":"http://img3.doubanio.com/view/photo/icon/public/p2411681319.jpg"}]
     * summary : 凯瑟琳上校（海伦·米伦 Helen Mirren 饰）率英国情报单位追捕一名女性恐怖分子长达六年，经由美军加入高空监视行动，好不容易在秘密基地找到疑似她的身影，特种部队准备活捉她时，高空侦查人员却意外发现该名恐怖分子正与其他人密谋自杀炸弹攻击，为了防止伤害，凯瑟琳下令轰炸秘密基地将敌人歼灭。当无人战斗机的驾驶员史蒂夫（亚伦·保尔 Aaron Paul 饰）瞄准目标后，却发现这个“秘密基地”竟然是普通的民居，而一名女孩更是跑进他的攻击范围玩耍，原本单纯的跨国逮捕行动瞬间变成复杂难解的反恐任务……
     * clips : [{"medium":"http://img3.doubanio.com/img/trailer/medium/2327844388.jpg?","title":"片段：Refer Up","subject_id":"10484117","alt":"https://movie.douban.com/trailer/194123/","small":"http://img3.doubanio.com/img/trailer/small/2327844388.jpg?","resource_url":"http://vt1.doubanio.com/201701212055/089c9b4dd3271439923ad6298bd8163c/view/movie/M/301940123.mp4","id":"194123"},{"medium":"http://img3.doubanio.com/img/trailer/medium/2324636756.jpg?","title":"片段：Rules of Engagement","subject_id":"10484117","alt":"https://movie.douban.com/trailer/192581/","small":"http://img3.doubanio.com/img/trailer/small/2324636756.jpg?","resource_url":"http://vt1.doubanio.com/201701212055/53c47e24d515510d860ca7ef4113b973/view/movie/M/301920581.mp4","id":"192581"}]
     * subtype : movie
     * directors : [{"avatars":{"small":"http://img7.doubanio.com/img/celebrity/small/1353058554.65.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1353058554.65.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1353058554.65.jpg"},"name_en":"Gavin Hood","name":"加文·胡德","alt":"https://movie.douban.com/celebrity/1045060/","id":"1045060"}]
     * comments_count : 16992
     * popular_reviews : [{"rating":{"max":5,"value":4,"min":0},"title":"我们是如何面对道德悖论的","subject_id":"10484117","author":{"uid":"1422362","avatar":"http://img3.doubanio.com/icon/u1422362-56.jpg","signature":"","alt":"http://www.douban.com/people/1422362/","id":"1422362","name":"鼠斩车田万齐"},"summary":"影片讲述一次针对自杀袭击恐怖分子的军事行动中，军方和政府为是否采取可能殃及一个无辜小女孩的飞弹打击而产生的分歧。这对应着一个经典道德悖论\u201c有轨电车问题\u201d：你是否会把即将撞死五个人的电车转向只会撞死...","alt":"https://movie.douban.com/review/7837992/","id":"7837992"},{"rating":{"max":5,"value":4,"min":0},"title":"嘴炮五人组详解\u2014真正的天空之眼","subject_id":"10484117","author":{"uid":"vampireamos","avatar":"http://img3.doubanio.com/icon/u1162481-628.jpg","signature":"下月改什么名","alt":"http://www.douban.com/people/vampireamos/","id":"1162481","name":"新年拜维达"},"summary":"本片是Alan Rickman的遗作，目前口碑不错。但是不知为何在发行上乏力。很多地方都只有少数院线放映，有一些国家甚至给了R的分级。其实除去极少数暴力镜头，影片可以说是老少皆宜。隔壁影评都是以需要用杀人的方式...","alt":"https://movie.douban.com/review/7851041/","id":"7851041"},{"rating":{"max":5,"value":5,"min":0},"title":"不是道德悖论，只有功利主义","subject_id":"10484117","author":{"uid":"faeries","avatar":"http://img7.doubanio.com/icon/u1895576-11.jpg","signature":"WE GET THE WORLD WE DESERVE","alt":"http://www.douban.com/people/faeries/","id":"1895576","name":"舟菖蒲"},"summary":"1. 一个小女孩还是80条生命？女政治家和将军在会议室里剑拔弩张。面对英国外长的质问，女政治家斩钉截铁地回答：\u201c对，我会用可能的80条性命来换取这个小女孩活着。如果恐怖袭击发生了，那也是恐怖分子干的。\u201d ...","alt":"https://movie.douban.com/review/7952619/","id":"7952619"},{"rating":{"max":5,"value":4,"min":0},"title":"杀掉一个人，拯救一百人，你如何选择？","subject_id":"10484117","author":{"uid":"1233038","avatar":"http://img7.doubanio.com/icon/u1233038-2.jpg","signature":"《并没有如愿以偿的人生》上市","alt":"http://www.douban.com/people/1233038/","id":"1233038","name":"frozenmoon"},"summary":"（文/杨时旸）     从题材上讲，这部《天空之眼》不可避免地会让人们联想到《猎杀本拉登》，但当电影进入正题，就会发现，即便都是有关打击恐怖分子的题材，而这二者之间其实并不相似。《天空之眼》在于提出了一...","alt":"https://movie.douban.com/review/7945532/","id":"7945532"},{"rating":{"max":5,"value":4,"min":0},"title":"\u2018军人该流泪么？\u2019的两难诠释---当然还有拜托让中国摆脱1970s尼克松访华的steretype吧！","subject_id":"10484117","author":{"uid":"57101911","avatar":"http://img7.doubanio.com/icon/u57101911-1.jpg","signature":"","alt":"http://www.douban.com/people/57101911/","id":"57101911","name":"奔跑的露水"},"summary":"（在Ipad上打了一个小时的影评，因为一个按键失误，灰飞烟灭，怒转电脑重新评论！）  天空之眼，是一部出乎意料的精彩之作~~  本来一开始没打算看这部电影，因为其它各场次都爆满，所以只好用这部电影kill time，...","alt":"https://movie.douban.com/review/7855673/","id":"7855673"},{"rating":{"max":5,"value":2,"min":0},"title":"洗脑力作","subject_id":"10484117","author":{"uid":"30577707","avatar":"http://img7.doubanio.com/icon/u30577707-5.jpg","signature":"= 蜡笔小新 + Jason Voorhees","alt":"http://www.douban.com/people/30577707/","id":"30577707","name":"涛"},"summary":"影片从表面上呈现出观点百家齐放。实际上在引导着观众往沟里带。 1- 影片里很多平民可能受伤，但是偏偏只关心一个小女孩，为什么？因为这个女孩有美国价值观：她看书她玩呼啦圈。其他的人死活是不管的。潜台词是...","alt":"https://movie.douban.com/review/7950738/","id":"7950738"},{"rating":{"max":5,"value":4,"min":0},"title":"一手杀人一手救人的道德困境，加文·胡德执导\u2014\u2014北美新片《天空之眼》漫谈","subject_id":"10484117","author":{"uid":"roseline","avatar":"http://img7.doubanio.com/icon/u1307054-11.jpg","signature":"除了诗和远方，还有电影和文学。","alt":"http://www.douban.com/people/roseline/","id":"1307054","name":"小玄儿"},"summary":"这次的题目再长，小玄儿也要把导演：加文·胡德的名字放进去，因为他是一位值得我们关注的南非裔导演。你很有可能看过他一鸣惊人的《黑帮暴徒》，那是2006年的奥斯卡最佳外语片，2005年炙手可热的影片，小玄儿回...","alt":"https://movie.douban.com/review/7831505/","id":"7831505"},{"rating":{"max":5,"value":4,"min":0},"title":"对不起，这不是道德公开课的电影版","subject_id":"10484117","author":{"uid":"fangyunan","avatar":"http://img3.doubanio.com/icon/u2312968-8.jpg","signature":"《如果我是权志龙你会爱我吗》","alt":"http://www.douban.com/people/fangyunan/","id":"2312968","name":"方聿南"},"summary":"话说，某英美联合情报部门追踪到三名恐怖头目的下落，并准备用无人机导弹送他们上天。可就在此时，一名当地小女孩闯入了爆破范围，极可能因这次打击而丧命。  一个看似简单的反恐决策，由此上升为牵涉甚广的道德...","alt":"https://movie.douban.com/review/7957663/","id":"7957663"},{"rating":{"max":5,"value":5,"min":0},"title":":中国近期很喜欢说别人圣母婊，难道大家都喜欢禽兽王？","subject_id":"10484117","author":{"uid":"runlyxu","avatar":"http://img3.doubanio.com/icon/user_normal.jpg","signature":"","alt":"http://www.douban.com/people/runlyxu/","id":"67461833","name":"runly"},"summary":"       虽然，这电影并不是我喜欢的类型。但是，看到一版面的回复，一个短评不足解我心中之愁。所以，必须开个开篇来讨论这个电影。        一看短评！全是\u201c圣母婊\u201d\u201c虚伪\u201d\u201c矫情\u201d，满屏的一星。这是一部反战...","alt":"https://movie.douban.com/review/8113938/","id":"8113938"},{"rating":{"max":5,"value":4,"min":0},"title":"欧美主旋律：道德与法律、战争与政治","subject_id":"10484117","author":{"uid":"herofaykjj","avatar":"http://img7.doubanio.com/icon/u40302985-4.jpg","signature":"中二到死。","alt":"http://www.douban.com/people/herofaykjj/","id":"40302985","name":"绝情兔"},"summary":"写在前面：如果让我来做这件事，那后面的故事就没有了。在一个人的生死和80个人的生死之间选一个，其实没有那么难。  其实看完这样电影，写影评都有一个固定的开头：看罢这部电影，我不禁陷入了沉思\u2026\u2026然后是以...","alt":"https://movie.douban.com/review/7959440/","id":"7959440"}]
     * ratings_count : 41527
     * aka : ["天眼行动(台)","天眼狙击(港)"]
     */

    private RatingBean rating;
    private int reviews_count;
    private int wish_count;
    private String original_title;
    private int collect_count;
    private ImagesBean images;
    private String douban_site;
    private String year;
    private String alt;
    private String id;
    private String mobile_url;
    private int photos_count;
    private String pubdate;
    private String title;
    private Object do_count;
    private boolean has_video;
    private String share_url;
    private Object seasons_count;
    private String schedule_url;
    private String website;
    private boolean has_schedule;
    private Object collection;
    private Object episodes_count;
    private boolean has_ticket;
    private Object current_season;
    private String mainland_pubdate;
    private String summary;
    private String subtype;
    private int comments_count;
    private int ratings_count;
    private List<?> videos;
    private List<?> blooper_urls;
    private List<PopularCommentsBean> popular_comments;
    private List<String> languages;
    private List<WritersBean> writers;
    private List<String> pubdates;
    private List<String> tags;
    private List<String> durations;
    private List<String> genres;
    private List<TrailersBean> trailers;
    private List<String> trailer_urls;
    private List<?> bloopers;
    private List<String> clip_urls;
    private List<CastsBean> casts;
    private List<String> countries;
    private List<PhotosBean> photos;
    private List<ClipsBean> clips;
    private List<DirectorsBean> directors;
    private List<PopularReviewsBean> popular_reviews;
    private List<String> aka;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public int getReviews_count() {
        return reviews_count;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getWish_count() {
        return wish_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getDouban_site() {
        return douban_site;
    }

    public void setDouban_site(String douban_site) {
        this.douban_site = douban_site;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile_url() {
        return mobile_url;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public int getPhotos_count() {
        return photos_count;
    }

    public void setPhotos_count(int photos_count) {
        this.photos_count = photos_count;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getDo_count() {
        return do_count;
    }

    public void setDo_count(Object do_count) {
        this.do_count = do_count;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public void setHas_video(boolean has_video) {
        this.has_video = has_video;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public Object getSeasons_count() {
        return seasons_count;
    }

    public void setSeasons_count(Object seasons_count) {
        this.seasons_count = seasons_count;
    }

    public String getSchedule_url() {
        return schedule_url;
    }

    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isHas_schedule() {
        return has_schedule;
    }

    public void setHas_schedule(boolean has_schedule) {
        this.has_schedule = has_schedule;
    }

    public Object getCollection() {
        return collection;
    }

    public void setCollection(Object collection) {
        this.collection = collection;
    }

    public Object getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(Object episodes_count) {
        this.episodes_count = episodes_count;
    }

    public boolean isHas_ticket() {
        return has_ticket;
    }

    public void setHas_ticket(boolean has_ticket) {
        this.has_ticket = has_ticket;
    }

    public Object getCurrent_season() {
        return current_season;
    }

    public void setCurrent_season(Object current_season) {
        this.current_season = current_season;
    }

    public String getMainland_pubdate() {
        return mainland_pubdate;
    }

    public void setMainland_pubdate(String mainland_pubdate) {
        this.mainland_pubdate = mainland_pubdate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public List<?> getVideos() {
        return videos;
    }

    public void setVideos(List<?> videos) {
        this.videos = videos;
    }

    public List<?> getBlooper_urls() {
        return blooper_urls;
    }

    public void setBlooper_urls(List<?> blooper_urls) {
        this.blooper_urls = blooper_urls;
    }

    public List<PopularCommentsBean> getPopular_comments() {
        return popular_comments;
    }

    public void setPopular_comments(List<PopularCommentsBean> popular_comments) {
        this.popular_comments = popular_comments;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<WritersBean> getWriters() {
        return writers;
    }

    public void setWriters(List<WritersBean> writers) {
        this.writers = writers;
    }

    public List<String> getPubdates() {
        return pubdates;
    }

    public void setPubdates(List<String> pubdates) {
        this.pubdates = pubdates;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getDurations() {
        return durations;
    }

    public void setDurations(List<String> durations) {
        this.durations = durations;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<TrailersBean> getTrailers() {
        return trailers;
    }

    public void setTrailers(List<TrailersBean> trailers) {
        this.trailers = trailers;
    }

    public List<String> getTrailer_urls() {
        return trailer_urls;
    }

    public void setTrailer_urls(List<String> trailer_urls) {
        this.trailer_urls = trailer_urls;
    }

    public List<?> getBloopers() {
        return bloopers;
    }

    public void setBloopers(List<?> bloopers) {
        this.bloopers = bloopers;
    }

    public List<String> getClip_urls() {
        return clip_urls;
    }

    public void setClip_urls(List<String> clip_urls) {
        this.clip_urls = clip_urls;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<PhotosBean> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotosBean> photos) {
        this.photos = photos;
    }

    public List<ClipsBean> getClips() {
        return clips;
    }

    public void setClips(List<ClipsBean> clips) {
        this.clips = clips;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    public List<PopularReviewsBean> getPopular_reviews() {
        return popular_reviews;
    }

    public void setPopular_reviews(List<PopularReviewsBean> popular_reviews) {
        this.popular_reviews = popular_reviews;
    }

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    public static class RatingBean {
        /**
         * max : 10
         * average : 7.9
         * details : {"1":175,"2":435,"3":3568,"4":8961,"5":4031}
         * stars : 40
         * min : 0
         */

        private int max;
        private double average;
        private DetailsBean details;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public DetailsBean getDetails() {
            return details;
        }

        public void setDetails(DetailsBean details) {
            this.details = details;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public static class DetailsBean {
            /**
             * 1 : 175
             * 2 : 435
             * 3 : 3568
             * 4 : 8961
             * 5 : 4031
             */

            @SerializedName("1")
            private int value1;
            @SerializedName("2")
            private int value2;
            @SerializedName("3")
            private int value3;
            @SerializedName("4")
            private int value4;
            @SerializedName("5")
            private int value5;

            public int getValue1() {
                return value1;
            }

            public void setValue1(int value1) {
                this.value1 = value1;
            }

            public int getValue2() {
                return value2;
            }

            public void setValue2(int value2) {
                this.value2 = value2;
            }

            public int getValue3() {
                return value3;
            }

            public void setValue3(int value3) {
                this.value3 = value3;
            }

            public int getValue4() {
                return value4;
            }

            public void setValue4(int value4) {
                this.value4 = value4;
            }

            public int getValue5() {
                return value5;
            }

            public void setValue5(int value5) {
                this.value5 = value5;
            }
        }
    }

    public static class ImagesBean {
        /**
         * small : http://img7.doubanio.com/view/movie_poster_cover/ipst/public/p2411665175.jpg
         * large : http://img7.doubanio.com/view/movie_poster_cover/lpst/public/p2411665175.jpg
         * medium : http://img7.doubanio.com/view/movie_poster_cover/spst/public/p2411665175.jpg
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class PopularCommentsBean {
        /**
         * rating : {"max":5,"value":5,"min":0}
         * useful_count : 449
         * author : {"uid":"catvoldemort","avatar":"http://img3.doubanio.com/icon/u27220223-207.jpg","signature":"Together we rule the Catlaxy","alt":"http://www.douban.com/people/catvoldemort/","id":"27220223","name":"Darth Meow"}
         * subject_id : 10484117
         * content : 完美反映英美政客对于反恐的不同观念和不同决断／讽刺的是让射杀行动变得复杂的小女孩被编剧塑造成了一个家庭思想先进，不拘于生活大环境学习数学会玩呼啦圈的形象，激发观众的同理心，忍不住想如果小女孩是一个早中晚拜阿拉的设定，不知道观众对她的紧张会不会少一些。
         * created_at : 2016-05-08 07:49:23
         * id : 1036427212
         */

        private RatingBeanX rating;
        private int useful_count;
        private AuthorBean author;
        private String subject_id;
        private String content;
        private String created_at;
        private String id;

        public RatingBeanX getRating() {
            return rating;
        }

        public void setRating(RatingBeanX rating) {
            this.rating = rating;
        }

        public int getUseful_count() {
            return useful_count;
        }

        public void setUseful_count(int useful_count) {
            this.useful_count = useful_count;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class RatingBeanX {
            /**
             * max : 5
             * value : 5
             * min : 0
             */

            private int max;
            private int value;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class AuthorBean {
            /**
             * uid : catvoldemort
             * avatar : http://img3.doubanio.com/icon/u27220223-207.jpg
             * signature : Together we rule the Catlaxy
             * alt : http://www.douban.com/people/catvoldemort/
             * id : 27220223
             * name : Darth Meow
             */

            private String uid;
            private String avatar;
            private String signature;
            private String alt;
            private String id;
            private String name;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class WritersBean {
        /**
         * avatars : {"small":"http://img7.doubanio.com/img/celebrity/small/1459156417.43.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1459156417.43.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1459156417.43.jpg"}
         * name_en : Guy Hibbert
         * name : 盖伊·希伯特
         * alt : https://movie.douban.com/celebrity/1286572/
         * id : 1286572
         */

        private AvatarsBean avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean {
            /**
             * small : http://img7.doubanio.com/img/celebrity/small/1459156417.43.jpg
             * large : http://img7.doubanio.com/img/celebrity/large/1459156417.43.jpg
             * medium : http://img7.doubanio.com/img/celebrity/medium/1459156417.43.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class TrailersBean {
        /**
         * medium : http://img3.doubanio.com/img/trailer/medium/2412205906.jpg?1484128842
         * title : 中国预告片 (中文字幕)
         * subject_id : 10484117
         * alt : https://movie.douban.com/trailer/210183/
         * small : http://img3.doubanio.com/img/trailer/small/2412205906.jpg?1484128842
         * resource_url : http://vt1.doubanio.com/201701212055/89e7111a4a96b96bd5382e16ca208141/view/movie/M/302100183.mp4
         * id : 210183
         */

        private String medium;
        private String title;
        private String subject_id;
        private String alt;
        private String small;
        private String resource_url;
        private String id;

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getResource_url() {
            return resource_url;
        }

        public void setResource_url(String resource_url) {
            this.resource_url = resource_url;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class CastsBean {
        /**
         * avatars : {"small":"http://img3.doubanio.com/img/celebrity/small/21169.jpg","large":"http://img3.doubanio.com/img/celebrity/large/21169.jpg","medium":"http://img3.doubanio.com/img/celebrity/medium/21169.jpg"}
         * name_en : Helen Mirren
         * name : 海伦·米伦
         * alt : https://movie.douban.com/celebrity/1054390/
         * id : 1054390
         */

        private AvatarsBeanX avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBeanX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBeanX avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBeanX {
            /**
             * small : http://img3.doubanio.com/img/celebrity/small/21169.jpg
             * large : http://img3.doubanio.com/img/celebrity/large/21169.jpg
             * medium : http://img3.doubanio.com/img/celebrity/medium/21169.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class PhotosBean {
        /**
         * thumb : http://img3.doubanio.com/view/photo/thumb/public/p2368161528.jpg
         * image : http://img3.doubanio.com/view/photo/photo/public/p2368161528.jpg
         * cover : http://img3.doubanio.com/view/photo/albumcover/public/p2368161528.jpg
         * alt : https://movie.douban.com/photos/photo/2368161528/
         * id : 2368161528
         * icon : http://img3.doubanio.com/view/photo/icon/public/p2368161528.jpg
         */

        private String thumb;
        private String image;
        private String cover;
        private String alt;
        private String id;
        private String icon;

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class ClipsBean {
        /**
         * medium : http://img3.doubanio.com/img/trailer/medium/2327844388.jpg?
         * title : 片段：Refer Up
         * subject_id : 10484117
         * alt : https://movie.douban.com/trailer/194123/
         * small : http://img3.doubanio.com/img/trailer/small/2327844388.jpg?
         * resource_url : http://vt1.doubanio.com/201701212055/089c9b4dd3271439923ad6298bd8163c/view/movie/M/301940123.mp4
         * id : 194123
         */

        private String medium;
        private String title;
        private String subject_id;
        private String alt;
        private String small;
        private String resource_url;
        private String id;

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getResource_url() {
            return resource_url;
        }

        public void setResource_url(String resource_url) {
            this.resource_url = resource_url;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class DirectorsBean {
        /**
         * avatars : {"small":"http://img7.doubanio.com/img/celebrity/small/1353058554.65.jpg","large":"http://img7.doubanio.com/img/celebrity/large/1353058554.65.jpg","medium":"http://img7.doubanio.com/img/celebrity/medium/1353058554.65.jpg"}
         * name_en : Gavin Hood
         * name : 加文·胡德
         * alt : https://movie.douban.com/celebrity/1045060/
         * id : 1045060
         */

        private AvatarsBeanXX avatars;
        private String name_en;
        private String name;
        private String alt;
        private String id;

        public AvatarsBeanXX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBeanXX avatars) {
            this.avatars = avatars;
        }

        public String getName_en() {
            return name_en;
        }

        public void setName_en(String name_en) {
            this.name_en = name_en;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBeanXX {
            /**
             * small : http://img7.doubanio.com/img/celebrity/small/1353058554.65.jpg
             * large : http://img7.doubanio.com/img/celebrity/large/1353058554.65.jpg
             * medium : http://img7.doubanio.com/img/celebrity/medium/1353058554.65.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class PopularReviewsBean {
        /**
         * rating : {"max":5,"value":4,"min":0}
         * title : 我们是如何面对道德悖论的
         * subject_id : 10484117
         * author : {"uid":"1422362","avatar":"http://img3.doubanio.com/icon/u1422362-56.jpg","signature":"","alt":"http://www.douban.com/people/1422362/","id":"1422362","name":"鼠斩车田万齐"}
         * summary : 影片讲述一次针对自杀袭击恐怖分子的军事行动中，军方和政府为是否采取可能殃及一个无辜小女孩的飞弹打击而产生的分歧。这对应着一个经典道德悖论“有轨电车问题”：你是否会把即将撞死五个人的电车转向只会撞死...
         * alt : https://movie.douban.com/review/7837992/
         * id : 7837992
         */

        private RatingBeanXX rating;
        private String title;
        private String subject_id;
        private AuthorBeanX author;
        private String summary;
        private String alt;
        private String id;

        public RatingBeanXX getRating() {
            return rating;
        }

        public void setRating(RatingBeanXX rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public AuthorBeanX getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBeanX author) {
            this.author = author;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class RatingBeanXX {
            /**
             * max : 5
             * value : 4
             * min : 0
             */

            private int max;
            private int value;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class AuthorBeanX {
            /**
             * uid : 1422362
             * avatar : http://img3.doubanio.com/icon/u1422362-56.jpg
             * signature :
             * alt : http://www.douban.com/people/1422362/
             * id : 1422362
             * name : 鼠斩车田万齐
             */

            private String uid;
            private String avatar;
            private String signature;
            private String alt;
            private String id;
            private String name;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
