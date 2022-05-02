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
  Optional<TriggerDefinition> definitionTriggerDefinition();

  Optional<Duration> timeFromStart();

  Optional<List<Extension>> extension();

  Optional<String> definitionCanonical();

  Optional<String> participantEffectiveDateTime();

  Optional<String> id();

  Optional<Evidencevariable_characteristicGroupmeasure> groupMeasure();

  Optional<DataRequirement> definitionDataRequirement();

  Optional<Duration> participantEffectiveDuration();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> definitionReference();

  Optional<Expression> definitionExpression();

  Optional<String> description();

  Optional<Boolean> exclude();

  Optional<Timing> participantEffectiveTiming();

  Optional<List<UsageContext>> usageContext();

  Optional<Period> participantEffectivePeriod();

  Optional<CodeableConcept> definitionCodeableConcept();

  static ImmutableEvidenceVariable_Characteristic.Builder builder() {
    return ImmutableEvidenceVariable_Characteristic.builder();
  }
}
