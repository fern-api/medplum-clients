package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSlot.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Slot {
  Optional<Code> language();

  Optional<Instant> start();

  Optional<Boolean> overbooked();

  Optional<List<CodeableConcept>> serviceType();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> appointmentType();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Identifier>> identifier();

  Optional<String> comment();

  String resourceType();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<Instant> end();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<SlotStatus> status();

  Reference schedule();

  static ImmutableSlot.ResourceTypeBuildStage builder() {
    return ImmutableSlot.builder();
  }
}
