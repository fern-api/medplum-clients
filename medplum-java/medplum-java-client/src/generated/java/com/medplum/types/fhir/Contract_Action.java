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
  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> requesterLinkId();

  Optional<CodeableConcept> performerRole();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Period> occurrencePeriod();

  Optional<List<String>> contextLinkId();

  CodeableConcept status();

  Optional<List<String>> reason();

  Optional<List<String>> performerLinkId();

  Optional<Reference> context();

  Optional<List<Reference>> reasonReference();

  Optional<String> occurrenceDateTime();

  Optional<List<Extension>> extension();

  Optional<Timing> occurrenceTiming();

  Optional<List<Reference>> requester();

  Optional<List<CodeableConcept>> performerType();

  Optional<Boolean> doNotPerform();

  Optional<List<UnsignedInt>> securityLabelNumber();

  CodeableConcept intent();

  Optional<String> id();

  CodeableConcept type();

  Optional<Reference> performer();

  Optional<List<Annotation>> note();

  Optional<List<String>> reasonLinkId();

  Optional<List<String>> linkId();

  Optional<List<Contract_Subject>> subject();

  static ImmutableContract_Action.StatusBuildStage builder() {
    return ImmutableContract_Action.builder();
  }
}
