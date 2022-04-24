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
    as = ImmutablePatient_Communication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Patient_Communication {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Boolean> preferred();

  Optional<String> id();

  CodeableConcept language();

  static ImmutablePatient_Communication.LanguageBuildStage builder() {
    return ImmutablePatient_Communication.builder();
  }
}
