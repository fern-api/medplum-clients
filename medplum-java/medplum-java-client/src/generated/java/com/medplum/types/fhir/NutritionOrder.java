package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<NutritionOrder_OralDiet> oralDiet();

  Optional<List<ResourceList>> contained();

  Reference patient();

  Optional<Reference> orderer();

  Optional<Id> id();

  Optional<Reference> encounter();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Uri>> instantiates();

  Optional<DateTime> dateTime();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<CodeableConcept>> excludeFoodModifier();

  Optional<List<Extension>> extension();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> foodPreferenceModifier();

  Optional<List<Reference>> allergyIntolerance();

  Optional<NutritionOrder_EnteralFormula> enteralFormula();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> status();

  String resourceType();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<NutritionOrder_Supplement>> supplement();

  Optional<Code> intent();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  static ImmutableNutritionOrder.PatientBuildStage builder() {
    return ImmutableNutritionOrder.builder();
  }
}
