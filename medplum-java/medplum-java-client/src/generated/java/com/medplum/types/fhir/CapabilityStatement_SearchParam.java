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
    as = ImmutableCapabilityStatement_SearchParam.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_SearchParam {
  Optional<Capabilitystatement_searchparamType> type();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<List<Extension>> modifierExtension();

  Optional<Canonical> definition();

  Optional<Markdown> documentation();

  static ImmutableCapabilityStatement_SearchParam.Builder builder() {
    return ImmutableCapabilityStatement_SearchParam.builder();
  }
}
