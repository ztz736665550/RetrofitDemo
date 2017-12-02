package com.example.ztz.retrofitdemo.bean;

/**
 * Created by ztz on 2017/12/1.
 */

public class DataBeans {
    /**
     * msg : 请求成功
     * code : 0
     * data : {"addr":"北京市昌平区","addrid":3,"mobile":123,"name":"边走边爱","status":1,"uid":71}
     */

    private String msg;
    private String code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * addr : 北京市昌平区
         * addrid : 3
         * mobile : 123
         * name : 边走边爱
         * status : 1
         * uid : 71
         */

        private String addr;
        private int addrid;
        private int mobile;
        private String name;
        private int status;
        private int uid;

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public int getAddrid() {
            return addrid;
        }

        public void setAddrid(int addrid) {
            this.addrid = addrid;
        }

        public int getMobile() {
            return mobile;
        }

        public void setMobile(int mobile) {
            this.mobile = mobile;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }
    }


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-12-01","title":"哪些现代诗歌美到了你，看到了就想把它背下来的？","description":"中国诗歌网","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-60630533.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512126012&signature=noSZYzMnZaxUGXritcjB-42ECvUD0MhXTF-gmMsOzVC0zVYU-iDDFSeZcMxYoMIVn4dqC*xsYzZMWELCM7MeTEEtY6TzYqHFyqVqCdKFdHs="},{"ctime":"2017-12-01","title":"《诗刊》2017年12月目录","description":"中国诗歌网","picUrl":"https://t1.qpic.cn/mblogpic/34d9dfb75cfceb04a840/2000","url":"https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512126012&signature=IbI*CYsIRhShk5eg2SaxHwxdHoYDyLHPKGUGo9W5XGt8UcWxkqlcb3cFLYWVz*rkaYZYdFn6IjE62sUII1saNeb-F69mP*fCLUppPMTm0Eo="},{"ctime":"2017-12-01","title":"摸鱼儿 听\u201c漂洋过海来看你\u201d用骆寒韵丨每日好诗","description":"中国诗歌网","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-60631000.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512126012&signature=7u*z*mk*n0nyAdi9FW39Bm8MOpO4QRUzoBSIGmitbOfg4ERf8bLsb93v3p-IxpQwCFRHwoR0Kd9yRJWZrGpBVa3TiBr45znaHLKE84MvHfw="},{"ctime":"2017-12-01","title":"摸鱼儿 听\u201c漂洋过海来看你\u201d用骆寒韵丨每日好诗","description":"中国诗歌网","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-60631000.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512126011&signature=7u*z*mk*n0nyAdi9FW39BqNfKzON*xDtMIj7v--X6aKMouU5D6Enxh2V*HGbgRt-a7pw*VFBMvFE8SPShy6WnoiccARo8yswHd1NC4g4ZYQ="},{"ctime":"2017-12-01","title":"哪些现代诗歌美到了你，看到了就想把它背下来的？","description":"中国诗歌网","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-60630533.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512126011&signature=noSZYzMnZaxUGXritcjB-6qonNhmy1mDnETz9Mzx0otPDvftUFn9hV07Y7KfQQJJ9Q5VKIh8VAzTUji0cVM0hmOjgjqdAr*s3AAtcmntbfQ="},{"ctime":"2017-12-01","title":"刘梦溪先生：古籍今译之我见","description":"章黄国学","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-12245126.static/640","url":"https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512126011&signature=IHfRk*CT1xKt4u*r7tPVtV6thh5y5rMyK5-pMkvhILJcRhG71wRQd*U*rG7R6OYwfQypTbtITxx1yWsAbYD7FATF3JwFbMpGbV4miz4Y5pM="},{"ctime":"2017-12-01","title":"2017年只剩下最后30天！年末致磨料磨具人：生活无路可退，但还需要点缀！","description":"磨商网","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-60634653.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512126010&signature=0kTQzjxZrt758TqC0br5LxBOm17u6H58fskBb6MrggVQ4-FjAmHAssiAU3DP*-rgmuwkAIbtmzb8adjBoLfrwWT1SErou*N8CXOmTO6ZBM8="},{"ctime":"2017-12-01","title":"中国好诗歌（2017年11月）","description":"诗刊社","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-60624667.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512122411&signature=KLmU0UvsegzhKpR6gb2DI1ngqoTG0y*1GcThl6JS0Ks6HYoxM*C4UdHXFqBAD1yLgKWz7HL5ku4Z24FZ-aYBhUPN4KvSbHU0thsQvuoaxz8="},{"ctime":"2017-12-01","title":"崖柏以前\u201c狂采乱挖\u201d，现在\u201c遍寻无果\u201d！","description":"崖柏","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-60624432.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512122411&signature=gMrteFS2LCdHTi2estrl4ieXZYJA2GmPlfBdRMnziNXwgBjvCr9M9BUdTIreF-GzP8n0A46k4rF861NpQWhKsHrx56zntUCoO-6HFpoW-3k="},{"ctime":"2017-12-01","title":"法律沙龙 | \u201c同人小说\u201d创作火爆，法律风险不容忽视","description":"创意世界","picUrl":"https://zxpic.gtimg.com/infonew/0/wechat_pics_-60624114.jpg/640","url":"https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512122410&signature=l4fQ*GjUlh7NdSEiplUyT8dcln19juN1Y4rwTcbY-fFnvwIaTHEc7DF**R3N2LmNzTNXRZvPCJYvI77sosVAMNGHoQo5GPSwrXj0m8OUYgo="}]
     */

    /*private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {*/
        /**
         * ctime : 2017-12-01
         * title : 哪些现代诗歌美到了你，看到了就想把它背下来的？
         * description : 中国诗歌网
         * picUrl : https://zxpic.gtimg.com/infonew/0/wechat_pics_-60630533.jpg/640
         * url : https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512126012&signature=noSZYzMnZaxUGXritcjB-42ECvUD0MhXTF-gmMsOzVC0zVYU-iDDFSeZcMxYoMIVn4dqC*xsYzZMWELCM7MeTEEtY6TzYqHFyqVqCdKFdHs=
         */

       /* private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }*/

}
