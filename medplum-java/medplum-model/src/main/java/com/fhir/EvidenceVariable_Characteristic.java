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
    as = ImmutableEvidenceVariable_Characteristic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EvidenceVariable_Characteristic {
  Optional<Reference> definitionReference();

  Optional<Expression> definitionExpression();

  Optional<Period> participantEffectivePeriod();

  Optional<List<Extension>> extension();

  Optional<Duration> participantEffectiveDuration();

  Optional<Timing> participantEffectiveTiming();

  Optional<String> id();

  Optional<Duration> timeFromStart();

  Optional<List<Extension>> modifierExtension();

  Optional<String> definitionCanonical();

  Optional<CodeableConcept> definitionCodeableConcept();

  Optional<String> description();

  Optional<Boolean> exclude();

  Optional<DataRequirement> definitionDataRequirement();

  Optional<List<UsageContext>> usageContext();

  Optional<String> participantEffectiveDateTime();

  Optional<Evidencevariable_characteristicGroupmeasure> groupMeasure();

  Optional<TriggerDefinition> definitionTriggerDefinition();

  static ImmutableEvidenceVariable_Characteristic.Builder builder() {
    return ImmutableEvidenceVariable_Characteristic.builder();
  }
}
