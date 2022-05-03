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
    as = ImmutableContract_Action.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Action {
  CodeableConcept intent();

  Optional<Reference> performer();

  Optional<List<Contract_Subject>> subject();

  Optional<List<Extension>> extension();

  Optional<List<String>> contextLinkId();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> performerLinkId();

  Optional<List<Reference>> reasonReference();

  Optional<Reference> context();

  Optional<CodeableConcept> performerRole();

  Optional<List<String>> requesterLinkId();

  Optional<List<String>> linkId();

  Optional<Period> occurrencePeriod();

  Optional<List<CodeableConcept>> reasonCode();

  CodeableConcept status();

  Optional<List<String>> reasonLinkId();

  Optional<List<Annotation>> note();

  Optional<String> occurrenceDateTime();

  Optional<Timing> occurrenceTiming();

  CodeableConcept type();

  Optional<List<CodeableConcept>> performerType();

  Optional<List<UnsignedInt>> securityLabelNumber();

  Optional<String> id();

  Optional<Boolean> doNotPerform();

  Optional<List<String>> reason();

  Optional<List<Reference>> requester();

  static ImmutableContract_Action.IntentBuildStage builder() {
    return ImmutableContract_Action.builder();
  }
}
