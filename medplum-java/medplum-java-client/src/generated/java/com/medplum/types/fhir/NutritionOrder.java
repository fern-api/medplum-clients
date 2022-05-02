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
  Optional<List<NutritionOrder_Supplement>> supplement();

  Optional<Reference> encounter();

  Optional<NutritionOrder_OralDiet> oralDiet();

  Optional<List<Identifier>> identifier();

  Optional<Code> status();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> allergyIntolerance();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Uri>> instantiates();

  Optional<Code> intent();

  Optional<NutritionOrder_EnteralFormula> enteralFormula();

  Optional<List<ResourceList>> contained();

  Optional<Reference> orderer();

  String resourceType();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> excludeFoodModifier();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<CodeableConcept>> foodPreferenceModifier();

  Optional<List<Annotation>> note();

  Reference patient();

  Optional<DateTime> dateTime();

  static ImmutableNutritionOrder.ResourceTypeBuildStage builder() {
    return ImmutableNutritionOrder.builder();
  }
}
