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
    as = ImmutableInvoice_Participant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Invoice_Participant {
  Optional<List<Extension>> modifierExtension();

  Reference actor();

  Optional<String> id();

  Optional<CodeableConcept> role();

  Optional<List<Extension>> extension();

  static ImmutableInvoice_Participant.ActorBuildStage builder() {
    return ImmutableInvoice_Participant.builder();
  }
}
