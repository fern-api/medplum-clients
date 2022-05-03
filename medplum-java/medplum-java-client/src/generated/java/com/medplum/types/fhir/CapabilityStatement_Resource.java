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
    as = ImmutableCapabilityStatement_Resource.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Resource {
  Optional<Boolean> conditionalCreate();

  Optional<List<Canonical>> supportedProfile();

  Optional<List<String>> searchInclude();

  Optional<List<Extension>> extension();

  Optional<Markdown> documentation();

  Optional<Capabilitystatement_resourceConditionalread> conditionalRead();

  Optional<Boolean> readHistory();

  Optional<Boolean> conditionalUpdate();

  Optional<List<CapabilityStatement_SearchParam>> searchParam();

  Optional<List<Extension>> modifierExtension();

  Optional<Canonical> profile();

  Optional<Capabilitystatement_resourceConditionaldelete> conditionalDelete();

  Optional<String> id();

  Optional<Code> type();

  Optional<Boolean> updateCreate();

  Optional<Capabilitystatement_resourceVersioning> versioning();

  Optional<List<CapabilityStatement_Operation>> operation();

  Optional<List<CapabilityStatement_Interaction>> interaction();

  Optional<List<String>> searchRevInclude();

  Optional<List<Capabilitystatement_resourceReferencepolicyItem>> referencePolicy();

  static ImmutableCapabilityStatement_Resource.Builder builder() {
    return ImmutableCapabilityStatement_Resource.builder();
  }
}
