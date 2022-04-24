package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableNutritionOrder.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NutritionOrder {
  Optional<dateTime> dateTime();

  Optional<List<CodeableConcept>> foodPreferenceModifier();

  Reference patient();

  Optional<List<uri>> instantiates();

  Optional<List<canonical>> instantiatesCanonical();

  Optional<List<CodeableConcept>> excludeFoodModifier();

  Optional<NutritionOrder_OralDiet> oralDiet();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<id> id();

  Optional<Reference> orderer();

  Optional<List<NutritionOrder_Supplement>> supplement();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<List<uri>> instantiatesUri();

  Optional<List<Annotation>> note();

  Optional<NutritionOrder_EnteralFormula> enteralFormula();

  Optional<Reference> encounter();

  Optional<code> language();

  Optional<code> intent();

  Optional<code> status();

  Optional<uri> implicitRules();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> allergyIntolerance();

  static ImmutableNutritionOrder.PatientBuildStage builder() {
    return ImmutableNutritionOrder.builder();
  }
}
