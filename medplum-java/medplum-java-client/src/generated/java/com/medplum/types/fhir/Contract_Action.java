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
  Optional<Reference> context();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> performerType();

  Optional<List<Annotation>> note();

  Optional<List<Contract_Subject>> subject();

  Optional<String> id();

  Optional<Boolean> doNotPerform();

  CodeableConcept status();

  Optional<CodeableConcept> performerRole();

  Optional<List<String>> linkId();

  Optional<List<Reference>> requester();

  CodeableConcept intent();

  Optional<String> occurrenceDateTime();

  Optional<List<Extension>> extension();

  Optional<List<String>> reason();

  Optional<List<String>> requesterLinkId();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> reasonReference();

  Optional<List<String>> reasonLinkId();

  Optional<List<String>> contextLinkId();

  Optional<List<UnsignedInt>> securityLabelNumber();

  Optional<Period> occurrencePeriod();

  Optional<List<String>> performerLinkId();

  CodeableConcept type();

  Optional<Timing> occurrenceTiming();

  Optional<Reference> performer();

  static ImmutableContract_Action.StatusBuildStage builder() {
    return ImmutableContract_Action.builder();
  }
}
