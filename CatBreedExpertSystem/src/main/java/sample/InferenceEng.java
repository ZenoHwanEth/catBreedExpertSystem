package sample;

import com.github.cschen1205.ess.engine.EqualsClause;
import com.github.cschen1205.ess.engine.KieRuleInferenceEngine;
import com.github.cschen1205.ess.engine.Rule;
import com.github.cschen1205.ess.engine.RuleInferenceEngine;

public class InferenceEng {


    public static RuleInferenceEngine getInferenceEngine()
    {

        RuleInferenceEngine rie= new KieRuleInferenceEngine();

        // shedding low
        Rule rule = new Rule("Abyssinian|European Burmese");
        rule.addAntecedent(new EqualsClause("shedding", "low"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Abyssinian,European Burmese","/CatPic/Abyssinian.jpg,/CatPic/European Burmese.jpg"));
        rie.addRule(rule);

        rule = new Rule("Colorpoint Shorthair");
        rule.addAntecedent(new EqualsClause("shedding", "low"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Colorpoint Shorthair","/CatPic/Colorpoint Shorthair.jpg"));
        rie.addRule(rule);

        rule = new Rule("Burmese,Devon Rex,Ocicat");
        rule.addAntecedent(new EqualsClause("shedding", "low"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "medium"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Burmese,Devon Rex,Ocicat","/CatPic/Burmese.jpg,/CatPic/Devon Rex.jpg,/CatPic/Ocicat.jpg"));
        rie.addRule(rule);

        rule = new Rule("Exotic Shorthair");
        rule.addAntecedent(new EqualsClause("shedding", "low"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "high"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Exotic Shorthair","/CatPic/Exotic Shorthair.jpg"));
        rie.addRule(rule);

        rule = new Rule("Sphynx");
        rule.addAntecedent(new EqualsClause("shedding", "low"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "medium"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "high"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Sphynx","/CatPic/Sphynx.jpg"));
        rie.addRule(rule);

        rule = new Rule("American Wirehair,Cornish Rex,LaPerm");
        rule.addAntecedent(new EqualsClause("shedding", "low"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("American Wirehair,Cornish Rex,LaPerm","/CatPic/American Wirehair.jpg,/CatPic/Cornish Rex.jpg,/CatPic/LaPerm.jpg"));
        rie.addRule(rule);

        rule = new Rule("Bombay,Turkish Angora");
        rule.addAntecedent(new EqualsClause("shedding", "low"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "medium"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Bombay,Turkish Angora","/CatPic/Bombay.jpg,/CatPic/Turkish Angora.jpg"));
        rie.addRule(rule);

        rule = new Rule("Siamese Cat,Singapura");
        rule.addAntecedent(new EqualsClause("shedding", "low"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "high"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Siamese Cat,Singapura","/CatPic/Siamese Cat.jpg,/CatPic/Singapura.jpg"));
        rie.addRule(rule);

        rule = new Rule("Korat");
        rule.addAntecedent(new EqualsClause("shedding", "low"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "medium"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "high"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Korat","/CatPic/Korat.jpg"));
        rie.addRule(rule);

        rule = new Rule("Balinese,Javanese");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Balinese,Javanese","/CatPic/Balinese.jpg,/CatPic/Javanese.jpg"));
        rie.addRule(rule);

        rule = new Rule("Somali");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Somali","/CatPic/Somali.jpg"));
        rie.addRule(rule);

        rule = new Rule("Bengal Cats");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Bengal Cats","/CatPic/Bengal Cats.jpg"));
        rie.addRule(rule);

        rule = new Rule("Chinese Li Hua");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "medium"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Chinese Li Hua","/CatPic/Chinese Li Hua.jpg"));
        rie.addRule(rule);

        rule = new Rule("Birman");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "high"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Birman","/CatPic/Birman.jpg"));
        rie.addRule(rule);

        rule = new Rule("Scottish Fold");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "medium"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "high"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Scottish Fold","/CatPic/Scottish Fold.jpg"));
        rie.addRule(rule);

        rule = new Rule("Japanese Bobtail,Savannah,Snowshoe");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Japanese Bobtail,Savannah,Snowshoe","/CatPic/Japanese Bobtail.jpg,/CatPic/Savannah.jpg,/CatPic/Snowshoe.jpg"));
        rie.addRule(rule);

        rule = new Rule("Burmilla,Egyptian Mau");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Burmilla,Egyptian Mau","/CatPic/Burmilla.jpg,/CatPic/Egyptian Mau.jpg"));
        rie.addRule(rule);

        rule = new Rule("Manx");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "medium"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Manx","/CatPic/Manx.jpg"));
        rie.addRule(rule);

        rule = new Rule("Havana Brown");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "medium"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Havana Brown","/CatPic/Havana Brown.jpg"));
        rie.addRule(rule);

        rule = new Rule("Russian Blue");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "medium"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Russian Blue","/CatPic/Russian Blue.jpg"));
        rie.addRule(rule);

        rule = new Rule("British Shorthair");
        rule.addAntecedent(new EqualsClause("shedding", "medium"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "low"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "high"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("British Shorthair","/CatPic/British Shorthair.jpg"));
        rie.addRule(rule);

        rule = new Rule("Oriental");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Oriental","/CatPic/Oriental.jpg"));
        rie.addRule(rule);

        rule = new Rule("Cymric,Tonkinese");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Cymric,Tonkinese","/CatPic/Cymric.jpg,/CatPic/Tonkinese.jpg"));
        rie.addRule(rule);

        rule = new Rule("Himalayan");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "medium"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Himalayan","/CatPic/Himalayan.jpg"));
        rie.addRule(rule);

        rule = new Rule("Norwegian Forest");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "medium"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "high"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Norwegian Forest","/CatPic/Norwegian Forest.jpg"));
        rie.addRule(rule);

        rule = new Rule("Persian");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "yes"));
        rule.addAntecedent(new EqualsClause("Playfulness", "low"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Persian","/CatPic/Persian.jpg"));
        rie.addRule(rule);

        rule = new Rule("American Bobtail");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("American Bobtail","/CatPic/American Bobtail.jpg"));
        rie.addRule(rule);

        rule = new Rule("Pixie-Bob,Siberian");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Pixie-Bob,Siberian","/CatPic/Pixie-Bob.jpg,/CatPic/Siberian.jpg"));
        rie.addRule(rule);

        rule = new Rule("Nebelung");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Nebelung","/CatPic/Nebelung.jpg"));
        rie.addRule(rule);

        rule = new Rule("American Curl");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "medium"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("American Curl","/CatPic/American Curl.jpg"));
        rie.addRule(rule);


        rule = new Rule("Selkrik Rex");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "medium"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Selkrik Rex","/CatPic/Selkrik Rex.jpg"));
        rie.addRule(rule);

        rule = new Rule("Maine Coon");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "medium"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Maine Coon","/CatPic/Maine Coon.jpg"));
        rie.addRule(rule);

        rule = new Rule("Ragdoll Cats");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "high"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "high"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Ragdoll Cats","/CatPic/Ragdoll Cats.jpg"));
        rie.addRule(rule);

        rule = new Rule("Ragamuffin");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "medium"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "yes"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "yes"));
        rule.setConsequent(new EqualsClause("Ragamuffin","/CatPic/Ragamuffin.jpg"));
        rie.addRule(rule);

        rule = new Rule("Chartreux");
        rule.addAntecedent(new EqualsClause("shedding", "high"));
        rule.addAntecedent(new EqualsClause("prone to health problem", "no"));
        rule.addAntecedent(new EqualsClause("Playfulness", "medium"));
        rule.addAntecedent(new EqualsClause("Tendency to vocalize", "low"));
        rule.addAntecedent(new EqualsClause("Friendly", "no"));
        rule.addAntecedent(new EqualsClause("Easy to groom", "no"));
        rule.setConsequent(new EqualsClause("Chartreux","/CatPic/Chartreux.jpg"));
        rie.addRule(rule);
        return  rie;
    }

}