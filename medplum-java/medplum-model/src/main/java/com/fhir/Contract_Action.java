package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<String>> requesterLinkId();

  Optional<List<String>> performerLinkId();

  Optional<List<String>> reasonLinkId();

  Optional<List<Extension>> extension();

  Optional<String> occurrenceDateTime();

  Optional<String> id();

  CodeableConcept status();

  Optional<List<String>> reason();

  CodeableConcept intent();

  Optional<Reference> context();

  Optional<CodeableConcept> performerRole();

  Optional<Timing> occurrenceTiming();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> reasonCode();

  CodeableConcept type();

  Optional<Boolean> doNotPerform();

  Optional<List<CodeableConcept>> performerType();

  Optional<List<unsignedInt>> securityLabelNumber();

  Optional<Reference> performer();

  Optional<List<String>> contextLinkId();

  Optional<List<Contract_Subject>> subject();

  Optional<List<Annotation>> note();

  Optional<Period> occurrencePeriod();

  Optional<List<Reference>> requester();

  Optional<List<String>> linkId();

  Optional<List<Reference>> reasonReference();

  static ImmutableContract_Action.StatusBuildStage builder() {
    return ImmutableContract_Action.builder();
  }
}
