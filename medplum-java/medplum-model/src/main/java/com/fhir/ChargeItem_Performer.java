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
    as = ImmutableChargeItem_Performer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ChargeItem_Performer {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Reference actor();

  Optional<CodeableConcept> function();

  static ImmutableChargeItem_Performer.ActorBuildStage builder() {
    return ImmutableChargeItem_Performer.builder();
  }
}
