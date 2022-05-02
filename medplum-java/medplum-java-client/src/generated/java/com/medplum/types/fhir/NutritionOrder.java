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
  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<CodeableConcept>> excludeFoodModifier();

  Optional<Reference> orderer();

  Optional<List<NutritionOrder_Supplement>> supplement();

  Optional<NutritionOrder_EnteralFormula> enteralFormula();

  Optional<Id> id();

  Optional<NutritionOrder_OralDiet> oralDiet();

  Optional<Reference> encounter();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Annotation>> note();

  Optional<List<ResourceList>> contained();

  Optional<List<Uri>> instantiatesUri();

  Optional<Code> status();

  Reference patient();

  Optional<List<Uri>> instantiates();

  Optional<DateTime> dateTime();

  Optional<Code> intent();

  Optional<List<CodeableConcept>> foodPreferenceModifier();

  Optional<List<Reference>> allergyIntolerance();

  Optional<List<Canonical>> instantiatesCanonical();

  String resourceType();

  Optional<List<Identifier>> identifier();

  static ImmutableNutritionOrder.PatientBuildStage builder() {
    return ImmutableNutritionOrder.builder();
  }
}
