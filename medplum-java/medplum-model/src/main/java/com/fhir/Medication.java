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
    as = ImmutableMedication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Medication {
  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<code> status();

  Optional<uri> implicitRules();

  Optional<Ratio> amount();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<id> id();

  Optional<code> language();

  Optional<Narrative> text();

  String resourceType();

  Optional<Reference> manufacturer();

  Optional<CodeableConcept> form();

  Optional<Medication_Batch> batch();

  Optional<List<Medication_Ingredient>> ingredient();

  Optional<CodeableConcept> code();

  static ImmutableMedication.ResourceTypeBuildStage builder() {
    return ImmutableMedication.builder();
  }
}
