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
    as = ImmutableCapabilityStatement_Rest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Rest {
  Optional<String> id();

  Optional<List<CapabilityStatement_Operation>> operation();

  Optional<Markdown> documentation();

  Optional<List<CapabilityStatement_Resource>> resource();

  Optional<CapabilityStatement_Security> security();

  Optional<List<Canonical>> compartment();

  Optional<List<Extension>> extension();

  Optional<Capabilitystatement_restMode> mode();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CapabilityStatement_SearchParam>> searchParam();

  Optional<List<CapabilityStatement_Interaction1>> interaction();

  static ImmutableCapabilityStatement_Rest.Builder builder() {
    return ImmutableCapabilityStatement_Rest.builder();
  }
}
