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
  Optional<String> id();

  Optional<List<String>> contextLinkId();

  Optional<Timing> occurrenceTiming();

  Optional<List<CodeableConcept>> performerType();

  Optional<String> occurrenceDateTime();

  Optional<List<String>> requesterLinkId();

  Optional<List<Reference>> reasonReference();

  Optional<List<Annotation>> note();

  Optional<List<String>> reason();

  CodeableConcept status();

  CodeableConcept type();

  Optional<List<String>> reasonLinkId();

  Optional<List<Contract_Subject>> subject();

  Optional<Reference> performer();

  Optional<List<Extension>> extension();

  Optional<Reference> context();

  Optional<List<String>> performerLinkId();

  Optional<List<String>> linkId();

  CodeableConcept intent();

  Optional<List<Reference>> requester();

  Optional<List<UnsignedInt>> securityLabelNumber();

  Optional<Boolean> doNotPerform();

  Optional<CodeableConcept> performerRole();

  Optional<Period> occurrencePeriod();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Extension>> modifierExtension();

  static ImmutableContract_Action.StatusBuildStage builder() {
    return ImmutableContract_Action.builder();
  }
}
