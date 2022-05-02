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
  Optional<Id> id();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<SlotStatus> status();

  Optional<String> comment();

  Optional<Instant> end();

  Optional<List<CodeableConcept>> serviceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Instant> start();

  Optional<List<Identifier>> identifier();

  Reference schedule();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<Narrative> text();

  Optional<CodeableConcept> appointmentType();

  Optional<Boolean> overbooked();

  static ImmutableSlot.ResourceTypeBuildStage builder() {
    return ImmutableSlot.builder();
  }
}
