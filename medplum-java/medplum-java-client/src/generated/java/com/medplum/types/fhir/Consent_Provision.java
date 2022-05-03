package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableConsent_Provision.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Consent_Provision {
  @JsonProperty("class")
  Optional<List<Coding>> _class();

  Optional<List<Coding>> purpose();

  Optional<Period> dataPeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Consent_provisionType> type();

  Optional<List<Consent_Data>> data();

  Optional<List<CodeableConcept>> code();

  Optional<List<Coding>> securityLabel();

  Optional<String> id();

  Optional<List<Consent_Provision>> provision();

  Optional<List<CodeableConcept>> action();

  Optional<Period> period();

  Optional<List<Consent_Actor>> actor();

  static ImmutableConsent_Provision.Builder builder() {
    return ImmutableConsent_Provision.builder();
  }
}
