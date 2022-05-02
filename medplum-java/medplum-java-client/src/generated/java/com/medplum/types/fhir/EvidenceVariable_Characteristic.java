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
    as = ImmutableEvidenceVariable_Characteristic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EvidenceVariable_Characteristic {
  Optional<Timing> participantEffectiveTiming();

  Optional<String> id();

  Optional<String> description();

  Optional<Evidencevariable_characteristicGroupmeasure> groupMeasure();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Boolean> exclude();

  Optional<Duration> timeFromStart();

  Optional<Expression> definitionExpression();

  Optional<DataRequirement> definitionDataRequirement();

  Optional<Reference> definitionReference();

  Optional<TriggerDefinition> definitionTriggerDefinition();

  Optional<String> participantEffectiveDateTime();

  Optional<Period> participantEffectivePeriod();

  Optional<String> definitionCanonical();

  Optional<CodeableConcept> definitionCodeableConcept();

  Optional<Duration> participantEffectiveDuration();

  Optional<List<UsageContext>> usageContext();

  static ImmutableEvidenceVariable_Characteristic.Builder builder() {
    return ImmutableEvidenceVariable_Characteristic.builder();
  }
}
