<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>


<html>

<head>
  <title>Index Page</title>
</head>

<body>
<spring:form method="post"  modelAttribute="userJSP" action="check-user">

    <br>
    КАЛЬКУЛЯТОР РАСЧЁТА
    <br>
    <br>

    <table>
        <style type="text/css">
            TABLE {
                width: 500px; /* Ширина таблицы */
                border-collapse: collapse; /* Убираем двойные линии между ячейками */
            }
            TD, TH {
                padding: 3px; /* Поля вокруг содержимого таблицы */
                border: 1px solid black; /* Параметры рамки */
            }
            TH {
                background: #b0e0e6; /* Цвет фона */
            }
        </style>
    <tbody>
    <tr>
        <td>Период, за который производится расчет:<br>
            квартал<br>
            полугодие<br>
            девять месяцев<br>
            год
        </td>
        <td width="50"> <br>
            <spring:radiobutton path = "periodMonth_1" value = "3" label = "квартал" />  <br>
            <spring:radiobutton path = "periodMonth_1" value = "6" label = "полугодие" /> <br>
            <spring:radiobutton path = "periodMonth_1" value = "9" label = "девять месяцев" /> <br>
            <spring:radiobutton path = "periodMonth_1" value = "12" label = "год" /> <br>
            </td>
        <td>(выбрать один из вариантов)</td>

    </tr>
    <tr>
        <td>Сумма выручки от реализации товаров (работ, услуг), имущественных прав за выбранный период (без налога на добавленную стоимость), руб.
        </td>
        <td>
            <spring:input path="income_2" type="number" id="id_2" />
        </td>
        <td>(указать сумму)</td>
    </tr>
    <tr>
        <td>Сумма внереализационных доходов за выбранный период (без налога на добавленную стоимость), руб.</td>
        <td>

            <spring:input path="nonoperatingIncome_3" type="number" id="id_3" />

        </td>
        <td>(указать сумму)</td>
    </tr>
    <tr>
        <td>Наличие места основной работы:<br>
            да<br>
            нет
        </td>
        <td>
            <spring:radiobutton path = "workPlace_4" value = "true" label = "да" name = "4" id = "id_41"/>  <br>
            <spring:radiobutton path = "workPlace_4" value = "false" label = "нет" name = "4" id = "id_42"/> <br>

        </td>
        <td>(выбрать один из вариантов)</td>
    </tr>
    <tr>
        <td>Наличие права на льготы (инвалид I или II группы, инвалид с детства, участник боевых действий на территории других государств и др.):<br>
            да<br>
            нет<br>
        </td>
        <td>
            <div class="check_dis_from_4">
            <spring:radiobutton path = "privileges_5" value = "true" label = "да" id="id_51" name = "5"/>  <br>
            <spring:radiobutton path = "privileges_5" value = "false" label = "нет" id="id_52" name = "5" /> <br>
            </div>
        </td>
        <td>(выбрать один из вариантов)</td>
    </tr>
    <tr>
        <td>Являетесь ли Вы вдовой (вдовцом), одиноким родителем, приемным родителем, опекуном или попечителем:<br>
            да<br>
            нет
        </td>
        <td>
            <div class="check_dis_from_4">
            <spring:radiobutton path = "widow_6" value = "true" label = "да" id="id_61" />  <br>
            <spring:radiobutton path = "widow_6" value = "false" label = "нет" id="id_62" /> <br>
            </div>
        </td>
        <td>(выбрать один из вариантов)</td>
    </tr>
    <tr>
        <td rowspan="2">Количество детей до 18 лет,<br>
            из них количество детей-инвалидов
        </td>
        <td><spring:input path="kids_7" type="number" id="id_7" /></td>
        <td>(указать количество)</td>
    </tr>
    <tr>
        <td><spring:input path="kidsDisabled_8" type="number" id="id_8" /></td>
        <td>(указать количество)</td>
    </tr>
    <tr>
        <td>Количество иждивенцев </td>
        <td><spring:input path="dependent_9" type="number" id="id_9" /></td>
        <td>(указать количество)</td>
    </tr>
    <tr>
        <td>Сумма расходов за выбранный период по страховым взносам по договорам добровольного страхования жизни и дополнительной пенсии, заключенным на срок не менее трех лет, а также по договорам добровольного страхования медицинских расходов, руб.</td>
        <td><spring:input path="costsInsurance_10" type="number" id="id_10" /></td>
        <td>(указать сумму)</td>
    </tr>
    <tr>
        <td>Сумма расходов за выбранный период на получение первого платного образования своего либо близких родственников, руб.</td>
        <td><spring:input path="costsEducation_11" type="number" id="id_11" /></td>
        <td>(указать сумму)</td>
    </tr>
    <tr>
        <td>Сумма расходов за выбранный период на строительство либо приобретение жилья для нуждающихся в улучшении жилищных условий, руб.</td>
        <td><spring:input path="costsHousing_12" type="number" id="id_12" /></td>
        <td>(указать сумму)</td>
    </tr>
    <tr>
        <td>Сумма расходов за выбранный период, связанных с осуществлением предпринимательской деятельности, руб. </td>
        <td><spring:input path="costsBusiness_13" type="number" id="id_13" /></td>
        <td>(указать сумму)</td>
    </tr>

    </tbody>
</table>
    <br>
    <button type="submit"  id = "id_but_culc" name="button_caclulate">Расчитать </button>
    <br>

    Подоходный налог к уплате, руб: <spring:input path="tax" id="tax" disabled="true"/>

</spring:form>

</body>

</html>

<script>
    function check_2_3_13(str) {
        var st2 = parseInt(document.getElementById('id_2').value);
        var st3 = parseInt(document.getElementById('id_3').value);
        var st13 = parseInt(document.getElementById('id_13').value);
        if (st13 > (st2 + st3)){
            alert("стр13 больше чем стр2+стр3");
            document.getElementById(str).value = 0;
        }
    }
    document.getElementById('id_2').onchange = function () {
        check_2_3_13('id_2');
    } ;
    document.getElementById('id_3').onchange =  function () {
        check_2_3_13('id_3');
    };
    document.getElementById('id_13').onchange =  function () {
        check_2_3_13('id_13');
    };

</script>

<script>
    document.getElementById('id_2').onkeydown = function (e) {
        return (/^[0-9,Backspace,Delete]+$/.test(e.key));  // IE > 9
    }
    document.getElementById('id_3').onkeydown = function (e) {
        return (/^[0-9,Backspace,Delete]+$/.test(e.key));  // IE > 9
    }

    var i;
    for (i = 7; i <= 13 ; i++) {
        document.getElementById('id_'+i).onkeydown = function (e) {
            return (/^[0-9,Backspace,Delete]+$/.test(e.key));  // IE > 9
        }
    }
</script>


<script>
    $(document).ready( function () {
            var i;
            if (document.getElementById('id_41').checked) {
                $('.check_dis_from_4 input').prop('disabled', true);
                for (i = 7; i <= 12 ; i++) {
                    document.getElementById('id_'+i).disabled = true;
                }
            } else {
                $('.check_dis_from_4 input').prop('disabled', false);
                for (i = 7; i <= 12 ; i++) {
                    document.getElementById('id_'+i).disabled = false;
                }
            }
    });
</script>

<script>
    $(document).on('change', 'input[type=radio][name=workPlace_4]', function() {
        var i;
        if ($(this).val() == 'true') {
            $('.check_dis_from_4 input').prop('disabled', true);
            for (i = 7; i <= 12 ; i++) {
                document.getElementById('id_'+i).disabled = true;
            }
        } else {
            $('.check_dis_from_4 input').prop('disabled', false);
            for (i = 7; i <= 12 ; i++) {
                document.getElementById('id_'+i).disabled = false;
            }
        }
    });
</script>
