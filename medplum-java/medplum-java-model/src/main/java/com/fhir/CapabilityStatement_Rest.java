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
    as = ImmutableCapabilityStatement_Rest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Rest {
  Optional<List<Extension>> extension();

  Optional<List<canonical>> compartment();

  Optional<markdown> documentation();

  Optional<List<CapabilityStatement_Operation>> operation();

  Optional<CapabilityStatement_Security> security();

  Optional<Capabilitystatement_restMode> mode();

  Optional<List<CapabilityStatement_SearchParam>> searchParam();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CapabilityStatement_Interaction1>> interaction();

  Optional<String> id();

  Optional<List<CapabilityStatement_Resource>> resource();

  static ImmutableCapabilityStatement_Rest.Builder builder() {
    return ImmutableCapabilityStatement_Rest.builder();
  }
}
