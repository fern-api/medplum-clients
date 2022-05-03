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
    as = ImmutableChargeItem_Performer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ChargeItem_Performer {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> function();

  Reference actor();

  static ImmutableChargeItem_Performer.ActorBuildStage builder() {
    return ImmutableChargeItem_Performer.builder();
  }
}
