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
    as = ImmutableMedication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Medication {
  Optional<Narrative> text();

  Optional<Medication_Batch> batch();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<Ratio> amount();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Reference> manufacturer();

  Optional<Meta> meta();

  Optional<List<Medication_Ingredient>> ingredient();

  Optional<Code> language();

  Optional<Code> status();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> form();

  static ImmutableMedication.ResourceTypeBuildStage builder() {
    return ImmutableMedication.builder();
  }
}
