package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<markdown> documentation();

  Optional<String> name();

  Optional<Capabilitystatement_searchparamType> type();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<canonical> definition();

  static ImmutableCapabilityStatement_SearchParam.Builder builder() {
    return ImmutableCapabilityStatement_SearchParam.builder();
  }
}
