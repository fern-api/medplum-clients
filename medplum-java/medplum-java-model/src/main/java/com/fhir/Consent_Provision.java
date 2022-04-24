package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Period> period();

  Optional<List<Extension>> extension();

  Optional<List<Coding>> securityLabel();

  Optional<List<Consent_Actor>> actor();

  Optional<Period> dataPeriod();

  @JsonProperty("class")
  Optional<List<Coding>> _class();

  Optional<List<CodeableConcept>> code();

  Optional<List<Consent_Provision>> provision();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Consent_Data>> data();

  Optional<List<CodeableConcept>> action();

  Optional<String> id();

  Optional<List<Coding>> purpose();

  Optional<Consent_provisionType> type();

  static ImmutableConsent_Provision.Builder builder() {
    return ImmutableConsent_Provision.builder();
  }
}
