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
  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<Reference> manufacturer();

  Optional<CodeableConcept> form();

  Optional<Medication_Batch> batch();

  Optional<Code> status();

  Optional<Ratio> amount();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<List<Medication_Ingredient>> ingredient();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> code();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  static ImmutableMedication.ResourceTypeBuildStage builder() {
    return ImmutableMedication.builder();
  }
}
