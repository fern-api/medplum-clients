package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCapabilityStatement_Document.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Document {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Markdown> documentation();

  Canonical profile();

  Optional<String> id();

  Optional<Capabilitystatement_documentMode> mode();

  static ImmutableCapabilityStatement_Document.ProfileBuildStage builder() {
    return ImmutableCapabilityStatement_Document.builder();
  }
}
