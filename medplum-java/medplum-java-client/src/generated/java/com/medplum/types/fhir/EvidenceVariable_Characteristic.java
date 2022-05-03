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
  Optional<CodeableConcept> definitionCodeableConcept();

  Optional<Period> participantEffectivePeriod();

  Optional<Duration> participantEffectiveDuration();

  Optional<DataRequirement> definitionDataRequirement();

  Optional<TriggerDefinition> definitionTriggerDefinition();

  Optional<Duration> timeFromStart();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Evidencevariable_characteristicGroupmeasure> groupMeasure();

  Optional<String> definitionCanonical();

  Optional<Timing> participantEffectiveTiming();

  Optional<Reference> definitionReference();

  Optional<String> participantEffectiveDateTime();

  Optional<List<UsageContext>> usageContext();

  Optional<Expression> definitionExpression();

  Optional<Boolean> exclude();

  static ImmutableEvidenceVariable_Characteristic.Builder builder() {
    return ImmutableEvidenceVariable_Characteristic.builder();
  }
}
