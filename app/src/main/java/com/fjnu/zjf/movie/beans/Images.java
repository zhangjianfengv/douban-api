package com.fjnu.zjf.movie.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/1/24 0024.
 */

public class Images {

    /**
     * count : 2
     * photos : [{"photos_count":435,"thumb":"https://img3.doubanio.com/view/photo/thumb/public/p2376640643.jpg","icon":"https://img3.doubanio.com/view/photo/icon/public/p2376640643.jpg","author":{"uid":"hanafudasama","avatar":"https://img3.doubanio.com/icon/u40354476-84.jpg","signature":"","alt":"https://www.douban.com/people/hanafudasama/","id":"40354476","name":"花 札"},"created_at":"2016-08-27 20:42:58","album_id":"1620390550","cover":"https://img3.doubanio.com/view/photo/albumcover/public/p2376640643.jpg","id":"2376640643","prev_photo":"2376646853","album_url":"https://movie.douban.com/subject/26683290/photos","comments_count":11,"image":"https://img3.doubanio.com/view/photo/photo/public/p2376640643.jpg","recs_count":19,"position":353,"alt":"https://movie.douban.com/photos/photo/2376640643/","album_title":"君の名は。(26683290)","next_photo":"2376639991","subject_id":"26683290","desc":""},{"photos_count":435,"thumb":"https://img3.doubanio.com/view/photo/thumb/public/p2388149950.jpg","icon":"https://img3.doubanio.com/view/photo/icon/public/p2388149950.jpg","author":{"uid":"18078608","avatar":"https://img3.doubanio.com/icon/u18078608-1353.jpg","signature":"東京日和","alt":"https://www.douban.com/people/18078608/","id":"18078608","name":"suddenly"},"created_at":"2016-10-10 16:31:10","album_id":"1620390550","cover":"https://img3.doubanio.com/view/photo/albumcover/public/p2388149950.jpg","id":"2388149950","prev_photo":"2388149969","album_url":"https://movie.douban.com/subject/26683290/photos","comments_count":80,"image":"https://img3.doubanio.com/view/photo/photo/public/p2388149950.jpg","recs_count":15,"position":271,"alt":"https://movie.douban.com/photos/photo/2388149950/","album_title":"君の名は。(26683290)","next_photo":"2388149343","subject_id":"26683290","desc":""}]
     * total : 50
     * start : 0
     * subject : {"rating":{"max":10,"average":8.5,"details":{"1":483,"3":14151,"2":1522,"5":43282,"4":34762},"stars":"45","min":0},"genres":["剧情","爱情","动画"],"title":"你的名字。","casts":[{"avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/13768.jpg","large":"https://img1.doubanio.com/img/celebrity/large/13768.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/13768.jpg"},"name_en":"Ryûnosuke Kamiki","name":"神木隆之介","alt":"https://movie.douban.com/celebrity/1185637/","id":"1185637"},{"avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1445093052.07.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1445093052.07.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1445093052.07.jpg"},"name_en":"Mone Kamishiraishi","name":"上白石萌音","alt":"https://movie.douban.com/celebrity/1316660/","id":"1316660"},{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/183.jpg","large":"https://img3.doubanio.com/img/celebrity/large/183.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/183.jpg"},"name_en":"Masami Nagasawa","name":"长泽雅美","alt":"https://movie.douban.com/celebrity/1018667/","id":"1018667"}],"durations":["106分钟"],"collect_count":328996,"mainland_pubdate":"2016-12-02","has_video":false,"original_title":"君の名は。","subtype":"movie","directors":[{"avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/39258.jpg","large":"https://img1.doubanio.com/img/celebrity/large/39258.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/39258.jpg"},"name_en":"Makoto Shinkai","name":"新海诚","alt":"https://movie.douban.com/celebrity/1005177/","id":"1005177"}],"pubdates":["2016-08-26(日本)","2016-12-02(中国大陆)"],"year":"2016","images":{"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2395733377.jpg","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2395733377.jpg","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2395733377.jpg"},"alt":"https://movie.douban.com/subject/26683290/","id":"26683290"}
     */

    private int count;
    private int total;
    private int start;
    private SubjectBean subject;
    private List<PhotosBean> photos;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public SubjectBean getSubject() {
        return subject;
    }

    public void setSubject(SubjectBean subject) {
        this.subject = subject;
    }

    public List<PhotosBean> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotosBean> photos) {
        this.photos = photos;
    }

    public static class SubjectBean {
        /**
         * rating : {"max":10,"average":8.5,"details":{"1":483,"3":14151,"2":1522,"5":43282,"4":34762},"stars":"45","min":0}
         * genres : ["剧情","爱情","动画"]
         * title : 你的名字。
         * casts : [{"avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/13768.jpg","large":"https://img1.doubanio.com/img/celebrity/large/13768.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/13768.jpg"},"name_en":"Ryûnosuke Kamiki","name":"神木隆之介","alt":"https://movie.douban.com/celebrity/1185637/","id":"1185637"},{"avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/1445093052.07.jpg","large":"https://img1.doubanio.com/img/celebrity/large/1445093052.07.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/1445093052.07.jpg"},"name_en":"Mone Kamishiraishi","name":"上白石萌音","alt":"https://movie.douban.com/celebrity/1316660/","id":"1316660"},{"avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/183.jpg","large":"https://img3.doubanio.com/img/celebrity/large/183.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/183.jpg"},"name_en":"Masami Nagasawa","name":"长泽雅美","alt":"https://movie.douban.com/celebrity/1018667/","id":"1018667"}]
         * durations : ["106分钟"]
         * collect_count : 328996
         * mainland_pubdate : 2016-12-02
         * has_video : false
         * original_title : 君の名は。
         * subtype : movie
         * directors : [{"avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/39258.jpg","large":"https://img1.doubanio.com/img/celebrity/large/39258.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/39258.jpg"},"name_en":"Makoto Shinkai","name":"新海诚","alt":"https://movie.douban.com/celebrity/1005177/","id":"1005177"}]
         * pubdates : ["2016-08-26(日本)","2016-12-02(中国大陆)"]
         * year : 2016
         * images : {"small":"https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2395733377.jpg","large":"https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2395733377.jpg","medium":"https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2395733377.jpg"}
         * alt : https://movie.douban.com/subject/26683290/
         * id : 26683290
         */

        private RatingBean rating;
        private String title;
        private int collect_count;
        private String mainland_pubdate;
        private boolean has_video;
        private String original_title;
        private String subtype;
        private String year;
        private ImagesBean images;
        private String alt;
        private String id;
        private List<String> genres;
        private List<CastsBean> casts;
        private List<String> durations;
        private List<DirectorsBean> directors;
        private List<String> pubdates;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCollect_count() {
            return collect_count;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public String getMainland_pubdate() {
            return mainland_pubdate;
        }

        public void setMainland_pubdate(String mainland_pubdate) {
            this.mainland_pubdate = mainland_pubdate;
        }

        public boolean isHas_video() {
            return has_video;
        }

        public void setHas_video(boolean has_video) {
            this.has_video = has_video;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
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

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public List<CastsBean> getCasts() {
            return casts;
        }

        public void setCasts(List<CastsBean> casts) {
            this.casts = casts;
        }

        public List<String> getDurations() {
            return durations;
        }

        public void setDurations(List<String> durations) {
            this.durations = durations;
        }

        public List<DirectorsBean> getDirectors() {
            return directors;
        }

        public void setDirectors(List<DirectorsBean> directors) {
            this.directors = directors;
        }

        public List<String> getPubdates() {
            return pubdates;
        }

        public void setPubdates(List<String> pubdates) {
            this.pubdates = pubdates;
        }

        public static class RatingBean {
            /**
             * max : 10
             * average : 8.5
             * details : {"1":483,"3":14151,"2":1522,"5":43282,"4":34762}
             * stars : 45
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
                 * 1 : 483
                 * 3 : 14151
                 * 2 : 1522
                 * 5 : 43282
                 * 4 : 34762
                 */

                @SerializedName("1")
                private int value1;
                @SerializedName("3")
                private int value3;
                @SerializedName("2")
                private int value2;
                @SerializedName("5")
                private int value5;
                @SerializedName("4")
                private int value4;

                public int getValue1() {
                    return value1;
                }

                public void setValue1(int value1) {
                    this.value1 = value1;
                }

                public int getValue3() {
                    return value3;
                }

                public void setValue3(int value3) {
                    this.value3 = value3;
                }

                public int getValue2() {
                    return value2;
                }

                public void setValue2(int value2) {
                    this.value2 = value2;
                }

                public int getValue5() {
                    return value5;
                }

                public void setValue5(int value5) {
                    this.value5 = value5;
                }

                public int getValue4() {
                    return value4;
                }

                public void setValue4(int value4) {
                    this.value4 = value4;
                }
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img1.doubanio.com/view/movie_poster_cover/ipst/public/p2395733377.jpg
             * large : https://img1.doubanio.com/view/movie_poster_cover/lpst/public/p2395733377.jpg
             * medium : https://img1.doubanio.com/view/movie_poster_cover/spst/public/p2395733377.jpg
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

        public static class CastsBean {
            /**
             * avatars : {"small":"https://img1.doubanio.com/img/celebrity/small/13768.jpg","large":"https://img1.doubanio.com/img/celebrity/large/13768.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/13768.jpg"}
             * name_en : Ryûnosuke Kamiki
             * name : 神木隆之介
             * alt : https://movie.douban.com/celebrity/1185637/
             * id : 1185637
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
                 * small : https://img1.doubanio.com/img/celebrity/small/13768.jpg
                 * large : https://img1.doubanio.com/img/celebrity/large/13768.jpg
                 * medium : https://img1.doubanio.com/img/celebrity/medium/13768.jpg
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

        public static class DirectorsBean {
            /**
             * avatars : {"small":"https://img1.doubanio.com/img/celebrity/small/39258.jpg","large":"https://img1.doubanio.com/img/celebrity/large/39258.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/39258.jpg"}
             * name_en : Makoto Shinkai
             * name : 新海诚
             * alt : https://movie.douban.com/celebrity/1005177/
             * id : 1005177
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
                 * small : https://img1.doubanio.com/img/celebrity/small/39258.jpg
                 * large : https://img1.doubanio.com/img/celebrity/large/39258.jpg
                 * medium : https://img1.doubanio.com/img/celebrity/medium/39258.jpg
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
    }

    public static class PhotosBean {
        /**
         * photos_count : 435
         * thumb : https://img3.doubanio.com/view/photo/thumb/public/p2376640643.jpg
         * icon : https://img3.doubanio.com/view/photo/icon/public/p2376640643.jpg
         * author : {"uid":"hanafudasama","avatar":"https://img3.doubanio.com/icon/u40354476-84.jpg","signature":"","alt":"https://www.douban.com/people/hanafudasama/","id":"40354476","name":"花 札"}
         * created_at : 2016-08-27 20:42:58
         * album_id : 1620390550
         * cover : https://img3.doubanio.com/view/photo/albumcover/public/p2376640643.jpg
         * id : 2376640643
         * prev_photo : 2376646853
         * album_url : https://movie.douban.com/subject/26683290/photos
         * comments_count : 11
         * image : https://img3.doubanio.com/view/photo/photo/public/p2376640643.jpg
         * recs_count : 19
         * position : 353
         * alt : https://movie.douban.com/photos/photo/2376640643/
         * album_title : 君の名は。(26683290)
         * next_photo : 2376639991
         * subject_id : 26683290
         * desc :
         */

        private int photos_count;
        private String thumb;
        private String icon;
        private AuthorBean author;
        private String created_at;
        private String album_id;
        private String cover;
        private String id;
        private String prev_photo;
        private String album_url;
        private int comments_count;
        private String image;
        private int recs_count;
        private int position;
        private String alt;
        private String album_title;
        private String next_photo;
        private String subject_id;
        private String desc;

        public int getPhotos_count() {
            return photos_count;
        }

        public void setPhotos_count(int photos_count) {
            this.photos_count = photos_count;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = album_id;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPrev_photo() {
            return prev_photo;
        }

        public void setPrev_photo(String prev_photo) {
            this.prev_photo = prev_photo;
        }

        public String getAlbum_url() {
            return album_url;
        }

        public void setAlbum_url(String album_url) {
            this.album_url = album_url;
        }

        public int getComments_count() {
            return comments_count;
        }

        public void setComments_count(int comments_count) {
            this.comments_count = comments_count;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getRecs_count() {
            return recs_count;
        }

        public void setRecs_count(int recs_count) {
            this.recs_count = recs_count;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getAlbum_title() {
            return album_title;
        }

        public void setAlbum_title(String album_title) {
            this.album_title = album_title;
        }

        public String getNext_photo() {
            return next_photo;
        }

        public void setNext_photo(String next_photo) {
            this.next_photo = next_photo;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public static class AuthorBean {
            /**
             * uid : hanafudasama
             * avatar : https://img3.doubanio.com/icon/u40354476-84.jpg
             * signature :
             * alt : https://www.douban.com/people/hanafudasama/
             * id : 40354476
             * name : 花 札
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
