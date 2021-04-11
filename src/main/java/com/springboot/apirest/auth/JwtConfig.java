package com.springboot.apirest.auth;

public class JwtConfig {
    public static final String SECRET_KEY = "EpmJ3PVAhdppvm";

    public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "b3BlbnNzaC1rZXktdjEAAAAABG5vbmUAAAAEbm9uZQAAAAAAAAABAAACFwAAAAdzc2gtcn\n" +
            "NhAAAAAwEAAQAAAgEApWU08qIjGRjr3C8fGYQd9UKD4xGZYVl1Kw1cYjxxTeki0EXYi/GZ\n" +
            "jL5bLDEVE0AntK5Z7GrKl+FXPLfb2+jEzmhBc898utEh7D8FbtID7OhiZlKjA3RWshLA84\n" +
            "d1FUSGHf26vnH8BbeNepIlWyV3b5X6UA2RkCuq+KYRtyVz3WzVgYmODsyNX+REohUkjEq1\n" +
            "8Q2s3UGpelZhVni7fsKl0iwRa6TpWp94ellvuQlpjxCMYqTe6DtsifyxtcFvIX3s6DoIHK\n" +
            "d7vQcNjT6+n93jSCRoR79PmneBV+JHNJVEczSPUKuM/NwyD6ozA99uwfq+Nvx9gXlgBZDZ\n" +
            "bm0EeYqEcyKPs4XoiOSx5E8NzAkCEjLJZQb32UK7203BV/2+MAI/zPR2xxKOqNhJaUYqbr\n" +
            "5o19pAP09H83ZSm58OsHKLaCiXQmtv5F9R+jSlGSHRRfCTv5EZRgNXzC+ciBneDknZpi9M\n" +
            "+rmiCme06yXyjGewZPxg1jck3R3FVgiuvU8ssYJUyJ6gccwTkoj5iCrAJXPhCXIDnmEQx3\n" +
            "+SLb9UmB0UXpxHeppLrt9YQNgePj7eI21UEYN78udzKFjCPRppUCWXwJvUqS2lgTIVADNU\n" +
            "sy+TWtjPzkveW5XbnbR9WMOBOUqaY2OvVSveCvvXWQfDmvafhnvex3BCz4+SnubGlP1H4D\n" +
            "UAAAdojThHdY04R3UAAAAHc3NoLXJzYQAAAgEApWU08qIjGRjr3C8fGYQd9UKD4xGZYVl1\n" +
            "Kw1cYjxxTeki0EXYi/GZjL5bLDEVE0AntK5Z7GrKl+FXPLfb2+jEzmhBc898utEh7D8Fbt\n" +
            "ID7OhiZlKjA3RWshLA84d1FUSGHf26vnH8BbeNepIlWyV3b5X6UA2RkCuq+KYRtyVz3WzV\n" +
            "gYmODsyNX+REohUkjEq18Q2s3UGpelZhVni7fsKl0iwRa6TpWp94ellvuQlpjxCMYqTe6D\n" +
            "tsifyxtcFvIX3s6DoIHKd7vQcNjT6+n93jSCRoR79PmneBV+JHNJVEczSPUKuM/NwyD6oz\n" +
            "A99uwfq+Nvx9gXlgBZDZbm0EeYqEcyKPs4XoiOSx5E8NzAkCEjLJZQb32UK7203BV/2+MA\n" +
            "I/zPR2xxKOqNhJaUYqbr5o19pAP09H83ZSm58OsHKLaCiXQmtv5F9R+jSlGSHRRfCTv5EZ\n" +
            "RgNXzC+ciBneDknZpi9M+rmiCme06yXyjGewZPxg1jck3R3FVgiuvU8ssYJUyJ6gccwTko\n" +
            "j5iCrAJXPhCXIDnmEQx3+SLb9UmB0UXpxHeppLrt9YQNgePj7eI21UEYN78udzKFjCPRpp\n" +
            "UCWXwJvUqS2lgTIVADNUsy+TWtjPzkveW5XbnbR9WMOBOUqaY2OvVSveCvvXWQfDmvafhn\n" +
            "vex3BCz4+SnubGlP1H4DUAAAADAQABAAACAQCV64g0Cw3/eNyKqFfrXBt/rjw4PkKmwFz5\n" +
            "mlHMZfdaZOH+oeEo8OV7cyzXgOIWogebupKePyrGwya9TfdHfdWvN0dk/4WTHXA/Ydy92D\n" +
            "Zgr0BKectznSfcoC0wUe+qSIO9ebmlWVLVp8zhdsnPtcVuaycLG1F/umVun7HdLmC5LCbY\n" +
            "FWSkO3xGmHYx6TJIzIvhJcE0iYli8BupMyTZQPzn5rQfu8seLwEY/irMMiDx4lEuNT4siX\n" +
            "jYFyrKkrz2QdvVoIyr1JDQBi2dg2ttI8caJI41ws8YOA0RKXXbzxXNy63AtM/GgJ4MHv3B\n" +
            "G+2cfXmgA/yLuQZ15ReCBeWReiKVeNeanoWx4r6OgvHyz3StXkiheCC0/sCEwB8mk3nbuO\n" +
            "B1h8wwnyR6QDA4ftW6Hbe5uGxYzWBKje851VWoyr2eDeGv6kJK1Iop48HIQUPlfrTawxGr\n" +
            "+iW1vYVdv9GZdZDxfBdq4Va1UgZirlNgTh1ZLi4hm/h87b/8MKpzpPVcXS4fNhPT+11D7w\n" +
            "N1AMA2DDMOlbyDpjev/4Azm5xU3/NwTittY5DfAGomoJ0KL/HpU4h/fRCRSGtj5WjVtrQD\n" +
            "8cO8AtMZo3AS03pQEc67/s6zZQQuK7/m5HaQIdQxqatu5BSk/K4truPLlj8MEPngCdwWwe\n" +
            "iXXyX9NHlcg/Z2GtntgQAAAQAOt3dv7NodnYMJCBMRtadY48KLiEjmoGLgbEWf+XT8F1ZA\n" +
            "gt691Y8tgDrNGmKeUdrTHub5FviWoLkirfNi/LNGWjJuPeFi5N+iZOciGw96N/xQZmNgve\n" +
            "n0l1Q0fe5rrDWYaQHncoOOiSI8j9OwogD3GIzfFuDQMBIYEiLzTk8PE2zLtIYLBu29rzPI\n" +
            "+XVX8NUqrcNski0ipbDRxujpibbppVXIzy7EEz17vDWLaF1PJw8KSGavlXwXa1xRw1Y68R\n" +
            "NkZrxHdICYB1mwNwYgbzORq72DaxFFJSsGt0oXcwhRqFyHSVTHlxKl/PubW5WirH1ZTO79\n" +
            "GHFc96vXlklq9OMGAAABAQDayn1RlZ5OMUIL90U4/SI2Up3Z8w/mE9y3v1B4iRjUvQPJHA\n" +
            "asnE3xkWOJjisRsA5QhkqeWmYTERgUs09jBPjRrFIinBO+cN+7K7GKgN35ODvAT5awrCSK\n" +
            "sysxRp1/6lpEmUXfNHbD+36aEVRApGpIdU370tBDJSMgTRSrU9DO8uJXqBGQc5vvNZ0fnB\n" +
            "MESBw7abIa64aF9LVkS9jFEU7CyfmEJXafjLhXVZvSltMmfUkt60kGLTDMHkp7IcD8fAK5\n" +
            "C26Q3XfTp9PWzXSlmMm+bCoEBjRK6IR6VrxgIXpLH2G1en5GViCj9QlxjVenFe3xFXSvX5\n" +
            "ntuQDFnfchnv1hAAABAQDBhgeUlxtIQThKrd6aGi3i+DUpVD9BrnTXgKzlLiFHuEoivb/n\n" +
            "0HxdfPwnBGa4nLWpkpRxHA9FqO6NrE4Kodf2BZ52TJ/UWc/tL/jvHhPg69WxzSZAEXTSif\n" +
            "+/Q014+OgDBTXVrTGN7bp95lp6ppLRbw07esL1rR99t3qpSAQMZBmVh8rjx+xO//PMoLfP\n" +
            "zwGX5OnacG9Id7pZwA8E5BAzSDdRdniksvPD3GpcrZiXQwWONAx6qMRsanbPjfsNPI3zMz\n" +
            "iTeW17hMTrBP5Us/TWN2EJe5FKH+Iy3u9Pbf/JoL5jRhjWud9LN0lgdyHd14zfTiIsuXVf\n" +
            "+V+sBmDOLx9VAAAAMHNlcmdpb2VzdGViYW5wZWxsZWplcm9AU2VyZ2lvcy1NYWNCb29rLV\n" +
            "Byby5sb2NhbAEC\n" +
            "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLIC = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQClZTTyoiMZGOvcLx8ZhB31QoPjEZlhWXUrDVxiPHFN6SLQRdiL8ZmMvlssMRUTQCe0rlnsasqX4Vc8t9vb6MTOaEFzz3y60SHsPwVu0gPs6GJmUqMDdFayEsDzh3UVRIYd/bq+cfwFt416kiVbJXdvlfpQDZGQK6r4phG3JXPdbNWBiY4OzI1f5ESiFSSMSrXxDazdQal6VmFWeLt+wqXSLBFrpOlan3h6WW+5CWmPEIxipN7oO2yJ/LG1wW8hfezoOggcp3u9Bw2NPr6f3eNIJGhHv0+ad4FX4kc0lURzNI9Qq4z83DIPqjMD327B+r42/H2BeWAFkNlubQR5ioRzIo+zheiI5LHkTw3MCQISMsllBvfZQrvbTcFX/b4wAj/M9HbHEo6o2ElpRipuvmjX2kA/T0fzdlKbnw6wcotoKJdCa2/kX1H6NKUZIdFF8JO/kRlGA1fML5yIGd4OSdmmL0z6uaIKZ7TrJfKMZ7Bk/GDWNyTdHcVWCK69TyyxglTInqBxzBOSiPmIKsAlc+EJcgOeYRDHf5Itv1SYHRRenEd6mkuu31hA2B4+Pt4jbVQRg3vy53MoWMI9GmlQJZfAm9SpLaWBMhUAM1SzL5Na2M/OS95bldudtH1Yw4E5SppjY69VK94K+9dZB8Oa9p+Ge97HcELPj5Ke5saU/UfgNQ== sergioestebanpellejero@Sergios-MacBook-Pro.local";
}
