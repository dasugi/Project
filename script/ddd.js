$(".slider").slick({
    dots:false,
    prevArrow: $(".prevBtn"),
    nextArrow: $(".nextBtn"),
});
$(".slider-nav").slick({
    dots:false,
    slidesToShow:7,
    asNavFor:".slider",
    focusOnSelect:true,
    centerMode:true,
});

$("#side_slider").slick({
    dots:false,
    slidesToShow:6,
    arrows:true,
    vertical:true,
    prevArrow: $("#pvBtn"),
    nextArrow: $("#ntBtn"),
});


$(document).ready(ntBtn);

