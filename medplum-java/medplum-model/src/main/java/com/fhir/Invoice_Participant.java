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
    as = ImmutableInvoice_Participant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Invoice_Participant {
  Reference actor();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<CodeableConcept> role();

  Optional<List<Extension>> modifierExtension();

  static ImmutableInvoice_Participant.ActorBuildStage builder() {
    return ImmutableInvoice_Participant.builder();
  }
}
