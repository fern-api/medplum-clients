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
    as = ImmutableIdentifier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Identifier {
  Optional<Period> period();

  Optional<CodeableConcept> type();

  Optional<IdentifierUse> use();

  Optional<Uri> system();

  Optional<Reference> assigner();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> value();

  static ImmutableIdentifier.Builder builder() {
    return ImmutableIdentifier.builder();
  }
}
