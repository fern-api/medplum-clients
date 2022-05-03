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
  Optional<List<CodeableConcept>> foodPreferenceModifier();

  Optional<NutritionOrder_OralDiet> oralDiet();

  Optional<Code> language();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<Annotation>> note();

  Optional<List<NutritionOrder_Supplement>> supplement();

  Optional<Reference> encounter();

  Optional<List<Reference>> allergyIntolerance();

  Optional<List<Identifier>> identifier();

  Optional<Code> intent();

  Optional<List<CodeableConcept>> excludeFoodModifier();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> dateTime();

  Optional<Narrative> text();

  Optional<Reference> orderer();

  Optional<List<Extension>> extension();

  Optional<List<Uri>> instantiates();

  Optional<Id> id();

  Optional<NutritionOrder_EnteralFormula> enteralFormula();

  Optional<Meta> meta();

  Optional<Code> status();

  Optional<List<Uri>> instantiatesUri();

  Optional<Uri> implicitRules();

  String resourceType();

  Reference patient();

  static ImmutableNutritionOrder.ResourceTypeBuildStage builder() {
    return ImmutableNutritionOrder.builder();
  }
}
