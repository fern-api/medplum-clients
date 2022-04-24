package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<instant> start();

  Optional<String> comment();

  Optional<Narrative> text();

  String resourceType();

  Optional<Boolean> overbooked();

  Optional<SlotStatus> status();

  Optional<List<Extension>> extension();

  Optional<code> language();

  Optional<CodeableConcept> appointmentType();

  Optional<List<ResourceList>> contained();

  Optional<id> id();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> serviceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> serviceCategory();

  Optional<Meta> meta();

  Optional<uri> implicitRules();

  Reference schedule();

  Optional<instant> end();

  Optional<List<CodeableConcept>> specialty();

  static ImmutableSlot.ResourceTypeBuildStage builder() {
    return ImmutableSlot.builder();
  }
}
