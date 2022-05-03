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
  Optional<String> participantEffectiveDateTime();

  Optional<String> definitionCanonical();

  Optional<CodeableConcept> definitionCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  Optional<DataRequirement> definitionDataRequirement();

  Optional<Duration> participantEffectiveDuration();

  Optional<Boolean> exclude();

  Optional<Timing> participantEffectiveTiming();

  Optional<TriggerDefinition> definitionTriggerDefinition();

  Optional<Evidencevariable_characteristicGroupmeasure> groupMeasure();

  Optional<String> description();

  Optional<Expression> definitionExpression();

  Optional<Duration> timeFromStart();

  Optional<Reference> definitionReference();

  Optional<List<UsageContext>> usageContext();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Period> participantEffectivePeriod();

  static ImmutableEvidenceVariable_Characteristic.Builder builder() {
    return ImmutableEvidenceVariable_Characteristic.builder();
  }
}
