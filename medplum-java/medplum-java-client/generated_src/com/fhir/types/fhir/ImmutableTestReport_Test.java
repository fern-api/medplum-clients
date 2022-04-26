package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link TestReport_Test}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestReport_Test.builder()}.
 */
@Generated(from = "TestReport_Test", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestReport_Test implements TestReport_Test {
  private final @Nullable String id;
  private final List<TestReport_Action1> action;
  private final @Nullable String name;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String description;

  private ImmutableTestReport_Test(
      @Nullable String id,
      List<TestReport_Action1> action,
      @Nullable String name,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String description) {
    this.id = id;
    this.action = action;
    this.name = name;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.description = description;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public List<TestReport_Action1> action() {
    return action;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Test#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Test withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestReport_Test(newValue, this.action, this.name, this.modifierExtension, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Test#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Test withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestReport_Test(value, this.action, this.name, this.modifierExtension, this.extension, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TestReport_Test#action() action}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Test withAction(TestReport_Action1... elements) {
    List<TestReport_Action1> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableTestReport_Test(this.id, newValue, this.name, this.modifierExtension, this.extension, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TestReport_Test#action() action}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of action elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Test withAction(Iterable<? extends TestReport_Action1> elements) {
    if (this.action == elements) return this;
    List<TestReport_Action1> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableTestReport_Test(this.id, newValue, this.name, this.modifierExtension, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Test#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Test withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableTestReport_Test(this.id, this.action, newValue, this.modifierExtension, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Test#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Test withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableTestReport_Test(this.id, this.action, value, this.modifierExtension, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Test#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Test withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestReport_Test(this.id, this.action, this.name, newValue, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Test#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Test withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestReport_Test(this.id, this.action, this.name, value, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Test#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Test withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestReport_Test(this.id, this.action, this.name, this.modifierExtension, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Test#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Test withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestReport_Test(this.id, this.action, this.name, this.modifierExtension, value, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Test#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Test withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableTestReport_Test(this.id, this.action, this.name, this.modifierExtension, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Test#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Test withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableTestReport_Test(this.id, this.action, this.name, this.modifierExtension, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestReport_Test} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestReport_Test
        && equalTo((ImmutableTestReport_Test) another);
  }

  private boolean equalTo(ImmutableTestReport_Test another) {
    return Objects.equals(id, another.id)
        && action.equals(another.action)
        && Objects.equals(name, another.name)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code action}, {@code name}, {@code modifierExtension}, {@code extension}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + action.hashCode();
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code TestReport_Test} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestReport_Test{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("action=").append(action);
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestReport_Test", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestReport_Test {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable List<TestReport_Action1> action = Collections.emptyList();
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("action")
    public void setAction(List<TestReport_Action1> action) {
      this.action = action;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public List<TestReport_Action1> action() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestReport_Test fromJson(Json json) {
    ImmutableTestReport_Test.Builder builder = ImmutableTestReport_Test.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.action != null) {
      builder.addAllAction(json.action);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableTestReport_Test) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestReport_Test} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestReport_Test instance
   */
  public static TestReport_Test copyOf(TestReport_Test instance) {
    if (instance instanceof ImmutableTestReport_Test) {
      return (ImmutableTestReport_Test) instance;
    }
    return ImmutableTestReport_Test.builder()
        .id(instance.id())
        .addAllAction(instance.action())
        .name(instance.name())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link TestReport_Test TestReport_Test}.
   * <pre>
   * ImmutableTestReport_Test.builder()
   *    .id(String) // optional {@link TestReport_Test#id() id}
   *    .addAction|addAllAction(com.fhir.types.fhir.TestReport_Action1) // {@link TestReport_Test#action() action} elements
   *    .name(String) // optional {@link TestReport_Test#name() name}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestReport_Test#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestReport_Test#extension() extension}
   *    .description(String) // optional {@link TestReport_Test#description() description}
   *    .build();
   * </pre>
   * @return A new TestReport_Test builder
   */
  public static ImmutableTestReport_Test.Builder builder() {
    return new ImmutableTestReport_Test.Builder();
  }

  /**
   * Builds instances of type {@link TestReport_Test TestReport_Test}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestReport_Test", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_NAME = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private long optBits;

    private @Nullable String id;
    private final List<TestReport_Action1> action = new ArrayList<TestReport_Action1>();
    private @Nullable String name;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestReport_Test#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Test#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Adds one element to {@link TestReport_Test#action() action} list.
     * @param element A action element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAction(TestReport_Action1 element) {
      this.action.add(Objects.requireNonNull(element, "action element"));
      return this;
    }

    /**
     * Adds elements to {@link TestReport_Test#action() action} list.
     * @param elements An array of action elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAction(TestReport_Action1... elements) {
      for (TestReport_Action1 element : elements) {
        this.action.add(Objects.requireNonNull(element, "action element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link TestReport_Test#action() action} list.
     * @param elements An iterable of action elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAction(Iterable<? extends TestReport_Action1> elements) {
      for (TestReport_Action1 element : elements) {
        this.action.add(Objects.requireNonNull(element, "action element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Test#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Test#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Test#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Test#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Test#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Test#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Test#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Test#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Builds a new {@link TestReport_Test TestReport_Test}.
     * @return An immutable instance of TestReport_Test
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestReport_Test build() {
      return new ImmutableTestReport_Test(id, createUnmodifiableList(true, action), name, modifierExtension, extension, description);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestReport_Test is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
