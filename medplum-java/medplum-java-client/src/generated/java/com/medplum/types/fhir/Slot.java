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
  Optional<List<CodeableConcept>> specialty();

  Optional<Code> language();

  Optional<Meta> meta();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<SlotStatus> status();

  Optional<String> comment();

  Optional<List<ResourceList>> contained();

  Optional<Instant> end();

  Optional<Id> id();

  Optional<CodeableConcept> appointmentType();

  Optional<List<CodeableConcept>> serviceType();

  Optional<Boolean> overbooked();

  Reference schedule();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Instant> start();

  static ImmutableSlot.ResourceTypeBuildStage builder() {
    return ImmutableSlot.builder();
  }
}
