<%@ page contentType="text/html;charset=UTF-8"%>

<%@ page trimDirectiveWhitespaces="true" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="simple.css">
</head>
<body>
<h2>Påmelding</h2>
<p style="color:red;">Påmeldingsdetaljer er ugyldige</p>
<fieldset class="registrering" id="root">
    <form action="registrer" method="post">
        <label>Fornavn</label>
        <input id="fornavn" type="text" name="fornavn" placeholder="Fornavn" minlength="2" maxlength="20"
               pattern="\s*\p{L}{2,}((\s+|-)\p{L}{2,})*\s*"
               title="Tillate tegn er kun bokstaver, mellomrom og enkel bindestrek mellom navn" value="${deltager.fornavn}" required>
        <label>Etternavn</label>
        <input id="etternavn" type="text" name="etternavn" placeholder="Etternavn" minlength="2" maxlength="20"
               pattern="\s*\p{L}{2,}((\s+|-)\p{L}{2,})*\s*"
               title="Tillate tegn er kun bokstaver, mellomrom og enkel bindestrek mellom navn" required>
        <label>Mobil (8 siffer)</label>
        <input id="mobil" type="text" name="mobil" placeholder="Mobil" minlength="8" maxlength="8"
               pattern="^[0-9]*$"
               title="Kun mobilnumre med 8 siffer er tillatt" required>
        <label>Passord</label>
        <input id="passord" type="password" name="passord" placeholder="Passord" required>
        <label>Gjenta passord</label>
        <input id="gpassord" type="password" name="passord" placeholder="Gjenta passord" required>
        <label>Kjønn:</label>
        <p><input id="mann" type="radio" name="kjonn" value="mann">mann <input id="kvinne" type="radio" name="kjonn" value="kvinne">kvinne</p>
        <input href="paameldingView.jsp" type="submit" value="Meld meg på">
    </form>
</fieldset>
</body>
</html>