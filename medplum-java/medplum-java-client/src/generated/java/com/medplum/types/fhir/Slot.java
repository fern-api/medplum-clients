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
  Reference schedule();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<Id> id();

  Optional<List<CodeableConcept>> serviceType();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Boolean> overbooked();

  Optional<Narrative> text();

  Optional<CodeableConcept> appointmentType();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> specialty();

  Optional<String> comment();

  String resourceType();

  Optional<Instant> end();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<SlotStatus> status();

  Optional<Instant> start();

  Optional<Uri> implicitRules();

  static ImmutableSlot.ScheduleBuildStage builder() {
    return ImmutableSlot.builder();
  }
}
