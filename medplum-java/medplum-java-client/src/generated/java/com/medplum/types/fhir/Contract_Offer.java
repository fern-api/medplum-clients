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
    as = ImmutableContract_Offer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Offer {
  Optional<CodeableConcept> decision();

  Optional<List<Contract_Answer>> answer();

  Optional<String> text();

  Optional<List<UnsignedInt>> securityLabelNumber();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<Reference> topic();

  Optional<List<Contract_Party>> party();

  Optional<List<Identifier>> identifier();

  Optional<List<String>> linkId();

  Optional<List<CodeableConcept>> decisionMode();

  static ImmutableContract_Offer.Builder builder() {
    return ImmutableContract_Offer.builder();
  }
}
