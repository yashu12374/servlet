package dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;
@Getter @Setter
public class SurveyDto implements Serializable,Comparable<String> {

    private String name;
    private String occupatation;
    private String education;
    private String nativePlace;
    private String fathername;
    private String mothername;
    private String gender;
    private String married;
    private String whname;
    private int age;
    private String date;
    private String height;
    private String weight;
    private String bloodGroup;
    private String bikeNumber;
    private String carNumber;
    private String MobileNo;
    private long adharno;
    private String panCard;
    private String voterId;
    private String passPort;
    private String rationCard;
    private String income;
    private String bankAccount;
    private String cycle;
    private String member;
    private String insurance;
    private String insuranceNo;
    private String laptop;
    private String tv;
    private String land;
    private String sites;
    private String rtcNo;
    private String taxes;
    private String employee;
    private String disabled;
    private String caste;
    private String religion;
    private String motherTongue;
    private String shoeSize;
    private String noOfShoes;
    private String friendname;
    private String electricity;
    private String water;
    private String buildingOwerName;
    private String crop;
    private String loanNo;
    private String loanBalance;
    private String loanType;
    private String gold;
    private String silver;
    private String petName;
    private String cows;
    private String shareHolding;

    public SurveyDto(String name, String occupatation, String education, String nativePlace,
                         String fathername, String mothername, String gender, String married,
                         String whname, int age, String date, String height, String weight,
                         String bloodGroup, String bikeNumber, String carNumber, String MobileNo,
                         long adharno, String panCard, String voterId, String passPort,
                         String rationCard, String income, String bankAccount, String cycle,
                         String member, String insurance, String insuranceNo, String laptop,
                         String tv, String land, String sites, String rtcNo, String taxes,
                         String employee, String disabled, String caste, String religion,
                         String motherTongue, String shoeSize, String noOfShoes, String friendname,
                         String electricity, String water, String buildingOwerName, String crop,
                         String loanNo, String loanBalance, String loanType, String gold,
                         String silver, String petName, String cows, String shareHolding) {
        this.name = name;
        this.occupatation = occupatation;
        this.education = education;
        this.nativePlace = nativePlace;
        this.fathername = fathername;
        this.mothername = mothername;
        this.gender = gender;
        this.married = married;
        this.whname = whname;
        this.age = age;
        this.date = date;
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.bikeNumber = bikeNumber;
        this.carNumber = carNumber;
        this.MobileNo = MobileNo;
        this.adharno = adharno;
        this.panCard = panCard;
        this.voterId = voterId;
        this.passPort = passPort;
        this.rationCard = rationCard;
        this.income = income;
        this.bankAccount = bankAccount;
        this.cycle = cycle;
        this.member = member;
        this.insurance = insurance;
        this.insuranceNo = insuranceNo;
        this.laptop = laptop;
        this.tv = tv;
        this.land = land;
        this.sites = sites;
        this.rtcNo = rtcNo;
        this.taxes = taxes;
        this.employee = employee;
        this.disabled = disabled;
        this.caste = caste;
        this.religion = religion;
        this.motherTongue = motherTongue;
        this.shoeSize = shoeSize;
        this.noOfShoes = noOfShoes;
        this.friendname = friendname;
        this.electricity = electricity;
        this.water = water;
        this.buildingOwerName = buildingOwerName;
        this.crop = crop;
        this.loanNo = loanNo;
        this.loanBalance = loanBalance;
        this.loanType = loanType;
        this.gold = gold;
        this.silver = silver;
        this.petName = petName;
        this.cows = cows;
        this.shareHolding = shareHolding;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SurveyDto surveyDto = (SurveyDto) o;
        return age == surveyDto.age && adharno == surveyDto.adharno && Objects.equals(name, surveyDto.name)
                && Objects.equals(occupatation, surveyDto.occupatation) && Objects.equals(education, surveyDto.education)
                && Objects.equals(nativePlace, surveyDto.nativePlace) && Objects.equals(fathername, surveyDto.fathername)
                && Objects.equals(mothername, surveyDto.mothername) && Objects.equals(gender, surveyDto.gender)
                && Objects.equals(married, surveyDto.married) && Objects.equals(whname, surveyDto.whname)
                && Objects.equals(date, surveyDto.date) && Objects.equals(height, surveyDto.height)
                && Objects.equals(weight, surveyDto.weight) && Objects.equals(bloodGroup, surveyDto.bloodGroup)
                && Objects.equals(bikeNumber, surveyDto.bikeNumber) && Objects.equals(carNumber, surveyDto.carNumber)
                && Objects.equals(MobileNo, surveyDto.MobileNo) && Objects.equals(panCard, surveyDto.panCard)
                && Objects.equals(voterId, surveyDto.voterId) && Objects.equals(passPort, surveyDto.passPort)
                && Objects.equals(rationCard, surveyDto.rationCard) && Objects.equals(income, surveyDto.income)
                && Objects.equals(bankAccount, surveyDto.bankAccount) && Objects.equals(cycle, surveyDto.cycle)
                && Objects.equals(member, surveyDto.member) && Objects.equals(insurance, surveyDto.insurance)
                && Objects.equals(insuranceNo, surveyDto.insuranceNo) && Objects.equals(laptop, surveyDto.laptop)
                && Objects.equals(tv, surveyDto.tv) && Objects.equals(land, surveyDto.land) && Objects.equals(sites, surveyDto.sites)
                && Objects.equals(rtcNo, surveyDto.rtcNo) && Objects.equals(taxes, surveyDto.taxes) && Objects.equals(employee, surveyDto.employee)
                && Objects.equals(disabled, surveyDto.disabled) && Objects.equals(caste, surveyDto.caste) && Objects.equals(religion, surveyDto.religion)
                && Objects.equals(motherTongue, surveyDto.motherTongue) && Objects.equals(shoeSize, surveyDto.shoeSize)
                && Objects.equals(noOfShoes, surveyDto.noOfShoes) && Objects.equals(friendname, surveyDto.friendname)
                && Objects.equals(electricity, surveyDto.electricity) && Objects.equals(water, surveyDto.water)
                && Objects.equals(buildingOwerName, surveyDto.buildingOwerName) && Objects.equals(crop, surveyDto.crop)
                && Objects.equals(loanNo, surveyDto.loanNo) && Objects.equals(loanBalance, surveyDto.loanBalance)
                && Objects.equals(loanType, surveyDto.loanType) && Objects.equals(gold, surveyDto.gold)
                && Objects.equals(silver, surveyDto.silver) && Objects.equals(petName, surveyDto.petName)
                && Objects.equals(cows, surveyDto.cows) && Objects.equals(shareHolding, surveyDto.shareHolding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, occupatation, education, nativePlace, fathername, mothername, gender, married, whname, age, date, height, weight, bloodGroup, bikeNumber, carNumber,
                MobileNo, adharno, panCard, voterId, passPort, rationCard, income, bankAccount, cycle, member, insurance, insuranceNo,
                laptop, tv, land, sites, rtcNo, taxes, employee, disabled, caste, religion, motherTongue, shoeSize, noOfShoes, friendname,
                electricity, water, buildingOwerName, crop, loanNo, loanBalance, loanType, gold, silver, petName, cows, shareHolding);
    }

    @Override
    public String toString() {
        return "SurveyDto{" +
                "name='" + name + '\'' +
                ", occupatation='" + occupatation + '\'' +
                ", education='" + education + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", fathername='" + fathername + '\'' +
                ", mothername='" + mothername + '\'' +
                ", gender='" + gender + '\'' +
                ", married='" + married + '\'' +
                ", whname='" + whname + '\'' +
                ", age=" + age +
                ", date='" + date + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", bikeNumber='" + bikeNumber + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", MobileNo='" + MobileNo + '\'' +
                ", adharno=" + adharno +
                ", panCard='" + panCard + '\'' +
                ", voterId='" + voterId + '\'' +
                ", passPort='" + passPort + '\'' +
                ", rationCard='" + rationCard + '\'' +
                ", income='" + income + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", cycle='" + cycle + '\'' +
                ", member='" + member + '\'' +
                ", insurance='" + insurance + '\'' +
                ", insuranceNo='" + insuranceNo + '\'' +
                ", laptop='" + laptop + '\'' +
                ", tv='" + tv + '\'' +
                ", land='" + land + '\'' +
                ", sites='" + sites + '\'' +
                ", rtcNo='" + rtcNo + '\'' +
                ", taxes='" + taxes + '\'' +
                ", employee='" + employee + '\'' +
                ", disabled='" + disabled + '\'' +
                ", caste='" + caste + '\'' +
                ", religion='" + religion + '\'' +
                ", motherTongue='" + motherTongue + '\'' +
                ", shoeSize='" + shoeSize + '\'' +
                ", noOfShoes='" + noOfShoes + '\'' +
                ", friendname='" + friendname + '\'' +
                ", electricity='" + electricity + '\'' +
                ", water='" + water + '\'' +
                ", buildingOwerName='" + buildingOwerName + '\'' +
                ", crop='" + crop + '\'' +
                ", loanNo='" + loanNo + '\'' +
                ", loanBalance='" + loanBalance + '\'' +
                ", loanType='" + loanType + '\'' +
                ", gold='" + gold + '\'' +
                ", silver='" + silver + '\'' +
                ", petName='" + petName + '\'' +
                ", cows='" + cows + '\'' +
                ", shareHolding='" + shareHolding + '\'' +
                '}';
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
